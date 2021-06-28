package net.javaguides.springbootforhaulmont.controller;

import net.javaguides.springbootforhaulmont.model.Bank;
import net.javaguides.springbootforhaulmont.service.BankServiceInterface;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
public class BankController {
    private final BankServiceInterface bankServiceInterface;

    public BankController(BankServiceInterface bankServiceInterface) {
        this.bankServiceInterface = bankServiceInterface;
    }

    public BankServiceInterface getBankServiceInterface() {
        return bankServiceInterface;
    }

    @GetMapping({"/bank_list"})
    public String viewHomePage(Model model) {
        model.addAttribute("listBank", bankServiceInterface.findAllBank());
        return "/bank/bank-list";
    }

    @GetMapping("/show_new_bank_form")
    public String showNewBankForm(Model model) {

        model.addAttribute("bank", new Bank());
        return "bank/bank-create";
    }

    @PostMapping("/save_bank")
    public String saveBank(@ModelAttribute("bank") Bank bank) {
        bankServiceInterface.saveBank(bank);
        return "redirect:/bank_list";
    }

    @GetMapping("/bank-view/{bankId}")
    public String showBank(@PathVariable("bankId") UUID bankId, Model model) {
        model.addAttribute("bank", bankServiceInterface.findBankById(bankId));
        return "bank/bank-view";
    }

    @GetMapping("/show_form_for_update/{bankId}")
    public String showFormForUpdate(@PathVariable("bankId") UUID bankId, Model model) {
        model.addAttribute("bank", bankServiceInterface.findBankById(bankId));
        return "bank/bank-update";
    }

    @GetMapping("/delete_bank/{bankId}")
    public String deleteBank(@PathVariable("bankId") UUID bankId) {
        bankServiceInterface.deleteBankById(bankId);
        return "redirect:/bank_list";
    }
}


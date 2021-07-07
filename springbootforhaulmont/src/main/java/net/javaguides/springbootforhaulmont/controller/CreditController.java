package net.javaguides.springbootforhaulmont.controller;


import net.javaguides.springbootforhaulmont.model.Credit;
import net.javaguides.springbootforhaulmont.service.BankServiceInterface;
import net.javaguides.springbootforhaulmont.service.CreditServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/credits")
public class CreditController {
    private final BankServiceInterface bankServiceInterface;
    private final CreditServiceInterface creditServiceInterface;

    @Autowired
    public CreditController(BankServiceInterface bankServiceInterface, CreditServiceInterface creditServiceInterface) {
        this.bankServiceInterface = bankServiceInterface;
        this.creditServiceInterface = creditServiceInterface;
    }

    @GetMapping("/credits_list/{bankId}")
    public String viewHomePage(@PathVariable("bankId") UUID bankId, Model model) {
        model.addAttribute("listCredits", creditServiceInterface.findByBankId(bankId)); // этот метод или findCreditById?
        return "/credit/credit-list";
    }

    @GetMapping("/show_new_credit_form/{bankId}")
    public String showNewCreditForm(Model model, @PathVariable("bankId") UUID bankId) {
        Credit credit = new Credit();
        credit.setBank(bankServiceInterface.findBankById(bankId));
        model.addAttribute("credit", credit);
        return "credit/credit-create";
    }

    @PostMapping("/save_credit")
    public String saveCredit(@ModelAttribute("credit") Credit credit, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return credit.getId() == null ? "/credit/credit-create" : "/credit/credit-update";
        }
        UUID bankId = credit.getBank().getId();
        creditServiceInterface.saveCredit(credit);
        return String.format("redirect:/credits/credits_list/%s", bankId);
    }

    @GetMapping("/show_form_for_update/{creditId}")
    public String showFormForUpdate(@PathVariable("creditId") UUID creditId, Model model) {
        model.addAttribute("credit", creditServiceInterface.findCreditById(creditId));
        return "credit/credit-update";
    }

    @GetMapping("/delete_credit/{creditId}")
    public String deleteCredit(@PathVariable("creditId") UUID creditId) {
        UUID bankId = creditServiceInterface.findCreditById(creditId).getBank().getId();
        creditServiceInterface.deleteCreditById(creditId);
        return String.format("redirect:/credits/credits_list/%s", bankId);
    }
}

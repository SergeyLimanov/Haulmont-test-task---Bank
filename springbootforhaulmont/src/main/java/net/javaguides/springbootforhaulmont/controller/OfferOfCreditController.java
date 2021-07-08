package net.javaguides.springbootforhaulmont.controller;

import net.javaguides.springbootforhaulmont.model.Client;
import net.javaguides.springbootforhaulmont.model.OfferOfCredit;
import net.javaguides.springbootforhaulmont.service.BankServiceInterface;
import net.javaguides.springbootforhaulmont.service.CalculationPaymentServiceInterface;
import net.javaguides.springbootforhaulmont.service.ClientServiceInterface;
import net.javaguides.springbootforhaulmont.service.OfferOfCreditInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/credit_offers")
public class OfferOfCreditController {
    private final ClientServiceInterface clientServiceInterface;
    private final BankServiceInterface bankServiceInterface;
    private final OfferOfCreditInterface offerOfCreditInterface;
    private final CalculationPaymentServiceInterface calculationPaymentServiceInterface;

    @Autowired
    public OfferOfCreditController(ClientServiceInterface clientServiceInterface,
                                   BankServiceInterface bankServiceInterface,
                                   OfferOfCreditInterface offerOfCreditInterface,
                                   CalculationPaymentServiceInterface calculationPaymentServiceInterface) {
        this.clientServiceInterface = clientServiceInterface;
        this.bankServiceInterface = bankServiceInterface;
        this.offerOfCreditInterface = offerOfCreditInterface;
        this.calculationPaymentServiceInterface = calculationPaymentServiceInterface;
    }

    @GetMapping("/credit_offers_list/{clientId}")
    public String viewHomePage(@PathVariable("clientId") UUID clientId, Model model) {
        model.addAttribute("listCreditOffers", offerOfCreditInterface.findByClientId(clientId));
        return "/offerOfCredit/offerOfCredit-list";
    }

    @GetMapping("/show_new_credit_offer_form/{clientId}")
    public String showNewCreditOfferForm(@PathVariable("clientId") UUID clientId, Model model) {
        Client client = clientServiceInterface.findClient(clientId);
        model.addAttribute("offerOfCredit", OfferOfCredit.builder().client(client)
                .bank(bankServiceInterface.findBankById(client.getBank().getId())).build());
        return "/offerOfCredit/offerOfCredit-create";
    }

    @PostMapping("/save_credit_offer")
    public String saveCreditOffer(@ModelAttribute("creditOffer") OfferOfCredit offerOfCredit,
                                  BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return offerOfCredit.getId() == null
                    ? "/offerOfCredit/offerOfCredit-create"
                    : "/offerOfCredit/offerOfCredit-update";
        }
        calculationPaymentServiceInterface.collectDataAboutOfferOfCredit(offerOfCredit);
        UUID clientId = offerOfCredit.getClient().getId();
        return String.format("redirect:/credit_offers/credit_offers_list/%s", clientId);
    }

    @GetMapping("/show_form_for_update/{offerOfCreditId}")
    public String showFormForUpdate(@PathVariable("offerOfCreditId") UUID offerOfCreditId, Model model) {
        model.addAttribute("offerOfCredit", offerOfCreditInterface.findOfferOfCreditById(offerOfCreditId));
        return "/offerOfCredit/offerOfCredit-update";
    }

    @GetMapping("/delete_credit_offer/{offerOfCreditId}")
    public String deleteCreditOffer(@PathVariable("offerOfCreditId") UUID offerOfCreditId) {
        UUID clientId = offerOfCreditInterface.findOfferOfCreditById(offerOfCreditId).getClient().getId();
        offerOfCreditInterface.deleteOfferOfCreditById(offerOfCreditId);
        return String.format("redirect:/credit_offers/credit_offers_list/%s", clientId);
    }
}

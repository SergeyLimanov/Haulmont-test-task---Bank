package net.javaguides.springbootforhaulmont.controller;

import net.javaguides.springbootforhaulmont.model.ScheduleOfPayment;
import net.javaguides.springbootforhaulmont.service.ScheduleOfPaymentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@Controller
@RequestMapping("/payment_schedules")
public class ScheduleOfPaymentController {
    private final ScheduleOfPaymentInterface scheduleOfPaymentInterface;

    @Autowired
    public ScheduleOfPaymentController(ScheduleOfPaymentInterface scheduleOfPaymentInterface) {
        this.scheduleOfPaymentInterface = scheduleOfPaymentInterface;
    }

    @GetMapping("/payment_schedules_list/{creditOfferId}")
    public String viewHomePage(@PathVariable("creditOfferId") UUID creditOfferId, Model model) {
        model.addAttribute("listPaymentSchedules", scheduleOfPaymentInterface.findByOfferOfCreditId(creditOfferId));
        return "/scheduleOfPayment/scheduleOfPayment-list";
    }

    @PostMapping("/save_payment_schedule")
    public String savePaymentSchedule(@ModelAttribute("paymentSchedule") ScheduleOfPayment scheduleOfPayment,
                                      BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "/scheduleOfPayment/scheduleOfPayment-update";
        }
        UUID creditOfferId = scheduleOfPayment.getOfferOfCredit().getId();
        scheduleOfPaymentInterface.saveScheduleOfPayment(scheduleOfPayment);
        return String.format("redirect:/payment_schedules/payment_schedules_list/%s", creditOfferId);
    }

    @GetMapping("/show_form_for_update/{paymentScheduleId}")
    public String showFormForUpdate(@PathVariable("paymentScheduleId") UUID paymentScheduleId, Model model) {
        model.addAttribute("paymentSchedule", scheduleOfPaymentInterface.findScheduleOfPaymentById(paymentScheduleId));
        return "scheduleOfPayment/scheduleOfPayment-update";
    }

    @GetMapping("/delete_payment_schedule/{paymentScheduleId}")
    public String deletePaymentSchedule(@PathVariable("paymentScheduleId") UUID paymentScheduleId) {
        UUID creditOfferId = scheduleOfPaymentInterface.findScheduleOfPaymentById(paymentScheduleId).getOfferOfCredit().getId();
        scheduleOfPaymentInterface.deleteScheduleOfPaymentById(paymentScheduleId);
        return String.format("redirect:/payment_schedules/payment_schedules_list/%s", creditOfferId);
    }
}



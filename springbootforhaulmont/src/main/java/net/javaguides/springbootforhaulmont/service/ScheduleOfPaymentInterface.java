package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.Credit;
import net.javaguides.springbootforhaulmont.model.ScheduleOfPayment;

import java.util.List;
import java.util.UUID;

public interface ScheduleOfPaymentInterface {

    public ScheduleOfPayment findScheduleOfPaymentById(UUID id);

    public List<ScheduleOfPayment> findAllScheduleOfPayment();

    public void deleteScheduleOfPaymentById(UUID id);

    public ScheduleOfPayment saveScheduleOfPayment(ScheduleOfPayment scheduleOfPayment);


}

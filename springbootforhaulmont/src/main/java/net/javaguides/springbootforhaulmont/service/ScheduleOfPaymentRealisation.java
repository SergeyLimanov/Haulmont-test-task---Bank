package net.javaguides.springbootforhaulmont.service;

import net.javaguides.springbootforhaulmont.model.Client;
import net.javaguides.springbootforhaulmont.model.ScheduleOfPayment;
import net.javaguides.springbootforhaulmont.repository.ClientRepository;
import net.javaguides.springbootforhaulmont.repository.ScheduleOfPaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.UUID;

public class ScheduleOfPaymentRealisation implements ScheduleOfPaymentInterface{
    
    private final ScheduleOfPaymentRepository scheduleOfPaymentRepository;

    @Autowired
    public ScheduleOfPaymentRealisation(ScheduleOfPaymentRepository scheduleOfPaymentRepository) {
        this.scheduleOfPaymentRepository = scheduleOfPaymentRepository;
    }

    @Override
    public ScheduleOfPayment findScheduleOfPaymentById(UUID id) {
        return scheduleOfPaymentRepository.getOne(id);
    }

    @Override
    public List<ScheduleOfPayment> findAllScheduleOfPayment() {
        return scheduleOfPaymentRepository.findAll();
    }

    @Override
    public void deleteScheduleOfPaymentById(UUID id) {
        scheduleOfPaymentRepository.deleteById(id);
    }

    @Override
    public ScheduleOfPayment saveScheduleOfPayment(ScheduleOfPayment scheduleOfPayment) {
        return scheduleOfPaymentRepository.save(scheduleOfPayment);
    }
}

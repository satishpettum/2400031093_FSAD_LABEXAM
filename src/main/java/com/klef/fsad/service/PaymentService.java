package com.klef.fsad.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.model.Payment;
import com.klef.fsad.repository.PaymentRepository;

@Service
public class PaymentService 
{
    @Autowired
    PaymentRepository paymentRepository;

    // Add Payment
    public Payment addPayment(Payment payment)
    {
        return paymentRepository.save(payment);
    }

    // View all payments
    public List<Payment> getAllPayments()
    {
        return paymentRepository.findAll();
    }
}
package com.klef.fsad.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.model.Payment;
import com.klef.fsad.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController 
{
    @Autowired
    PaymentService paymentService;

    // POST : Add Payment
    @PostMapping("/add")
    public Payment addPayment(@RequestBody Payment payment)
    {
        return paymentService.addPayment(payment);
    }

    // GET : View all payments
    @GetMapping("/view")
    public List<Payment> viewPayments()
    {
        return paymentService.getAllPayments();
    }
}
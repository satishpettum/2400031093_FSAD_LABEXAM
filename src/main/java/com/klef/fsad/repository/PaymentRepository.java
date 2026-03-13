package com.klef.fsad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klef.fsad.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>
{

}
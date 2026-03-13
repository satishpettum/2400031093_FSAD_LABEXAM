package com.klef.fsad.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="payment_table")
public class Payment 
{
    @Id
    private int paymentid;   // manually provided

    private String name;
    private String status;

    public Payment() 
    {

    }

    public int getPaymentid() 
    {
        return paymentid;
    }

    public void setPaymentid(int paymentid) 
    {
        this.paymentid = paymentid;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setStatus(String status) 
    {
        this.status = status;
    }
}
package com.versetti.Loan.Challenge.dto;

import com.versetti.Loan.Challenge.domain.Customer.Customer;

public record CLoanRequest (String name, String document, Integer age, Double income, String location) {
    public Customer getCustomer () {
        return new Customer(name, document, age, income, location);
    }
}

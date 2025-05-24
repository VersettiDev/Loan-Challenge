package com.versetti.Loan.Challenge.domain.Customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Customer {

    private String name;
    private String document;
    private Integer age;

    private Double income;
    private String location;

    public boolean isIncomeEqualOrLower (Double amount) {
        return income <= amount;
    }

    public boolean isIncomeEqualOrHigher (Double amount) {
        return income >= amount;
    }

    public boolean isIncomeBetween (Double minAmount, Double maxAmount) {
        return income >= minAmount && income <= maxAmount;
    }

    public boolean isAgeLowerThan (Integer age) {
        return this.age < age;
    }

    public boolean isLocationAllowed (String location) {
        return this.location.equalsIgnoreCase(location);
    }
}

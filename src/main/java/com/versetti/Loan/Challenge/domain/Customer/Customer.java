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
}

package com.versetti.Loan.Challenge.dto;

import com.versetti.Loan.Challenge.domain.Customer.Customer;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

public record CLoanRequest (
        @NotBlank(message = "O nome não pode estar em branco")
        String name,

        @CPF(message = "CPF inválido")
        String document,

        @Min(value = 18, message = "A idade mínima é 18 anos")
        @NotNull(message = "A idade é obrigatória")
        Integer age,

        @Min(value = 1000, message = "A renda mínima é R$ 1000,00")
        @NotNull(message = "A renda é obrigatória")
        Double income,

        @NotBlank(message = "A localização não pode estar em branco")
        String location
) {
    public Customer getCustomer () {
        return new Customer(name, document, age, income, location);
    }
}

package com.versetti.Loan.Challenge.domain.Loan;

import com.versetti.Loan.Challenge.domain.Customer.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Loan {
    private Customer customer;

    public boolean isPersonalLoanAllowed () {
        if (customer.isIncomeEqualOrLower(3000.0)) {
            return true;
        }

        return (
                customer.isIncomeBetween(3000.0, 5000.0)
                        && customer.isAgeLowerThan(30)
                        && customer.isLocationAllowed("SP")
        );
    }

    public boolean isConsignementLoanAllowed () {
        return customer.isIncomeEqualOrHigher(5000.0);
    }

    public boolean isGuarantedLoanAllowed () {
        if (customer.isIncomeEqualOrLower(3000.0)) {
            return true;
        }

        return (
                customer.isIncomeBetween(3000.0, 5000.0)
                        && customer.isAgeLowerThan(30)
                        && customer.isLocationAllowed("SP")
        );
    }

    public double getPersonalInterest () {
        if (isPersonalLoanAllowed()) {
            return 4.0;
        }
        throw new LoanException("Personal Loan not allowed");
    }

    public double getConsignementInterest () {
        if (isConsignementLoanAllowed()) {
            return 2.0;
        }
        throw new LoanException("Consignement Loan not allowed");
    }

    public double getGuarantedInterest () {
        if (isGuarantedLoanAllowed()) {
            return 2.0;
        }
        throw new LoanException("Guaranted Loan not allowed");
    }
}

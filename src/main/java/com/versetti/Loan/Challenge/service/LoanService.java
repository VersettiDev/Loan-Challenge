package com.versetti.Loan.Challenge.service;

import com.versetti.Loan.Challenge.domain.Loan.Loan;
import com.versetti.Loan.Challenge.domain.Loan.LoanType;
import com.versetti.Loan.Challenge.dto.CLoanRequest;
import com.versetti.Loan.Challenge.dto.CLoanResponse;
import com.versetti.Loan.Challenge.dto.LoanResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LoanService {
    public CLoanResponse getLoansAvaibleToCustomer (CLoanRequest loanRequest) {
        var Customer = loanRequest.getCustomer();
        var loan = new Loan(Customer);

        List<LoanResponse> loans = new ArrayList<>();
        if (loan.isPersonalLoanAllowed()) {
            loans.add(new LoanResponse(LoanType.PERSONAL, loan.getPersonalInterest()));
        }

        if (loan.isConsignementLoanAllowed()) {
            loans.add(new LoanResponse(LoanType.CONSIGNMENT, loan.getConsignementInterest()));
        }

        if (loan.isGuarantedLoanAllowed()) {
            loans.add(new LoanResponse(LoanType.GUARANTED, loan.getGuarantedInterest()));
        }

        return new CLoanResponse(Customer.getName(), loans);
    }
}

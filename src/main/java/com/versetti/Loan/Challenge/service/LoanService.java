package com.versetti.Loan.Challenge.service;

import com.versetti.Loan.Challenge.domain.Loan.Loan;
import com.versetti.Loan.Challenge.dto.CLoanRequest;
import com.versetti.Loan.Challenge.dto.CLoanResponse;
import org.springframework.stereotype.Service;

@Service
public class LoanService {
    public CLoanResponse getLoansAvaibleToCustomer (CLoanRequest loanRequest) {
        var Customer = loanRequest.getCustomer();
        var loan = new Loan(Customer);
        return null;
    }
}

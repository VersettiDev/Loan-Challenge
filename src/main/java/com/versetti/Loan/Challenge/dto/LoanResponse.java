package com.versetti.Loan.Challenge.dto;

import com.versetti.Loan.Challenge.domain.Loan.LoanType;

public record LoanResponse(LoanType type, Double interestRate) {
}

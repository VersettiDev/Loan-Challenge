package com.versetti.Loan.Challenge.dto;

import com.versetti.Loan.Challenge.domain.Loan.Loan;

import java.util.List;

public record CLoanResponse(String name, List<LoanResponse> loans) {
}

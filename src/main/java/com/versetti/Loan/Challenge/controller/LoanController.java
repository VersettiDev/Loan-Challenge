package com.versetti.Loan.Challenge.controller;

import com.versetti.Loan.Challenge.dto.CLoanRequest;
import com.versetti.Loan.Challenge.dto.CLoanResponse;
import com.versetti.Loan.Challenge.service.LoanService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer-loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping
    public ResponseEntity<CLoanResponse> getAvaibleLoans (@RequestBody @Valid CLoanRequest loanRequest) {
        var loanResponse = loanService.getLoansAvaibleToCustomer(loanRequest);
        return ResponseEntity.status(HttpStatus.OK).body(loanResponse);
    }
}

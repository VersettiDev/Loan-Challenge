package com.versetti.Loan.Challenge.dto;

import java.time.LocalDateTime;
import java.util.List;


public record ExceptionResponse (
        LocalDateTime timestamp,
        Integer status,
        String error,
        List<String> messages,
        String path
) {}


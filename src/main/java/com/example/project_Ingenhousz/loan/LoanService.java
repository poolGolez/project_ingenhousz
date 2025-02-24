package com.example.project_Ingenhousz.loan;

import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class LoanService {

    public Iterable<Loan> listAllLoans() {
        // TODO: Implement me
        return Collections.emptyList();
    }

    public Loan createLoan(CreateLoanParams params) {
        return params.toLoan();
    }
}


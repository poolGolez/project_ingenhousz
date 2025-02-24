package com.example.project_Ingenhousz.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoanService {

    @Autowired
    private LoanRepository loanRepository;

    public Iterable<Loan> listAllLoans() {
        return loanRepository.findAll();
    }

    public Loan createLoan(CreateLoanParams params) {
        Loan loan = params.toLoan();
        return loanRepository.save(loan);
    }
}


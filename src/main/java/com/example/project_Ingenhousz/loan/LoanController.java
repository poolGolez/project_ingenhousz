package com.example.project_Ingenhousz.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @GetMapping
    Iterable<Loan> list() {
        return loanService.listAllLoans();
    }

    @PostMapping
    Loan create(@RequestBody CreateLoanParams params) {
        return loanService.createLoan(params);
    }
}

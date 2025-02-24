package com.example.project_Ingenhousz.loan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @GetMapping
    public Iterable<Loan> list() {
        return Collections.emptyList();
    }
}

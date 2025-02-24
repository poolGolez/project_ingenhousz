package com.example.project_Ingenhousz.loan;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Loan {

    BigDecimal loanAmount;
    int yearsPayable;
    BigDecimal annualInterestRate;

    public Loan(BigDecimal loanAmount, int yearsPayable, BigDecimal annualInterestRate) {
        this.loanAmount = loanAmount;
        this.yearsPayable = yearsPayable;
        this.annualInterestRate = annualInterestRate;
    }
}

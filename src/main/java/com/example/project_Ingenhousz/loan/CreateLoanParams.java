package com.example.project_Ingenhousz.loan;

import java.math.BigDecimal;

public record CreateLoanParams(
    BigDecimal loanAmount,
    int yearsPayable,
    BigDecimal annualInterestRate
) {

    public Loan toLoan() {
        return new Loan(loanAmount, yearsPayable, annualInterestRate);
    }
}

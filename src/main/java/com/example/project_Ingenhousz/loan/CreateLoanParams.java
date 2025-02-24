package com.example.project_Ingenhousz.loan;

import java.math.BigDecimal;

public record CreateLoanParams(
    BigDecimal loanAmount,
    int yearsPayable,
    BigDecimal annualInterestRate
) {

    public Loan toLoan() {
        Loan loan = new Loan();
        loan.setLoanAmount(loanAmount);
        loan.setYearsPayable(yearsPayable);
        loan.setAnnualInterestRate(annualInterestRate);

        return loan;
    }
}

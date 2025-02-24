package com.example.project_Ingenhousz.loan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity(name="loans")
public class Loan {

    @Id
    @SequenceGenerator(name = "loans_id_seq", sequenceName = "loans_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "loans_id_seq")
    Long id;

    BigDecimal loanAmount;

    int yearsPayable;

    BigDecimal annualInterestRate;

    public Loan(BigDecimal loanAmount, int yearsPayable, BigDecimal annualInterestRate) {
        this.loanAmount = loanAmount;
        this.yearsPayable = yearsPayable;
        this.annualInterestRate = annualInterestRate;
    }
}

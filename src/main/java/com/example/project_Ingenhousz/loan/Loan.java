package com.example.project_Ingenhousz.loan;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Getter
@Setter
@Entity(name = "loans")
public class Loan {

    @Id
    @SequenceGenerator(name = "loans_id_seq", sequenceName = "loans_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "loans_id_seq")
    private Long id;

    private BigDecimal loanAmount;

    private int yearsPayable;

    @Column(precision = 19, scale = 6)
    private BigDecimal annualInterestRate;

    @JsonIgnore
    public int getMonthsPayable() {
        return yearsPayable * 12;
    }

    @JsonIgnore
    public BigDecimal getMonthlyInterestRate() {
        return annualInterestRate.divide(new BigDecimal("12"), RoundingMode.HALF_UP);
    }
}

package com.epam.training.dataaccess.model;

import java.math.BigDecimal;

/**
 * Created by Mao Shaco on 11/19/2015.
 */
public class Expense extends AbstractDataObject {
    private BigDecimal totalExpense;

    public BigDecimal getTotalExpense() {
        return totalExpense;
    }

    public void setTotalExpense(BigDecimal totalExpense) {
        this.totalExpense = totalExpense;
    }
}

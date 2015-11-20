package com.epam.training.dataaccess.model;

import java.math.BigDecimal;

/**
 * Created by Mao Shaco on 11/19/2015.
 */
public class Expense extends AbstractDataObject {
    private BigDecimal totalCost;

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }
}

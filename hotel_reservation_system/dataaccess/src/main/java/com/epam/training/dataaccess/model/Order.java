package com.epam.training.dataaccess.model;

import java.util.Date;

/**
 * Created by Mao Shaco on 11/15/2015.
 */
public class Order extends AbstractDataObject {
    private Room room;
    private InOutDate inOutDate;
    private Expense expense;
    private Date orderDate;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public InOutDate getInOutDate() {
        return inOutDate;
    }

    public void setInOutDate(InOutDate inOutDate) {
        this.inOutDate = inOutDate;
    }

    public Expense getExpense() {
        return expense;
    }

    public void setExpense(Expense expense) {
        this.expense = expense;
    }

    public Date getDate() {
        return orderDate;
    }

    public void setDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}

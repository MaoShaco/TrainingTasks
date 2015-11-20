package com.epam.training.dataaccess.model;

import java.util.Date;

/**
 * Created by Mao Shaco on 11/15/2015.
 */
public class Order extends AbstractDataObject {
    private Room room;
    private Long inOutDateId;
    private Long expenseId;
    private Date orderDate;

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Long getInOutDateId() {
        return inOutDateId;
    }

    public void setInOutDateId(Long inOutDateId) {
        this.inOutDateId = inOutDateId;
    }

    public Long getExpenseId() {
        return expenseId;
    }

    public void setExpenseId(Long expenseId) {
        this.expenseId = expenseId;
    }

    public Date getDate() {
        return orderDate;
    }

    public void setDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}

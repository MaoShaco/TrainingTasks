package com.epam.java.training.system;

import java.util.Date;

/**
 * Created by Mao Shaco on 11/15/2015.
 */
public class Order {
    private int roomID;
    private int dateInOutID;
    private int expenseID;
    private Date orderDate;

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public int getDateInOutID() {
        return dateInOutID;
    }

    public void setDateInOutID(int dateInOutID) {
        this.dateInOutID = dateInOutID;
    }

    public int getExpenseID() {
        return expenseID;
    }

    public void setExpenseID(int expenseID) {
        this.expenseID = expenseID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}

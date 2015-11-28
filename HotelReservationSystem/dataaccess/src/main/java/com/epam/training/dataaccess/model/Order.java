package com.epam.training.dataaccess.model;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Mao Shaco on 11/15/2015.
 */
public class Order extends AbstractDataObject {

    public Order(){
        this.setOrderDate(Calendar.getInstance().getTime());
    }

    private Long roomId;
    private Long inOutDateId;
    private Long expenseId;
    private Date orderDate;
    private Long clientId;

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
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

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
}

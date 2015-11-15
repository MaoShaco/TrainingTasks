package com.epam.java.training.system;

import java.util.List;

/**
 * Created by Mao Shaco on 11/15/2015.
 */
public class Client {
    private String clientName;
    private List<Integer> orderID;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public List<Integer> getOrderID() {
        return orderID;
    }

    public void setOrderID(List<Integer> orderID) {
        this.orderID = orderID;
    }
}

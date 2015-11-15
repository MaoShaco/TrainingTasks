package com.epam.java.training.system;

import java.math.BigDecimal;

/**
 * Created by Mao Shaco on 11/15/2015.
 */
public class Room {
    private int bedsTypeID;
    private int roomClassID;
    private int roomInfoID;
    private BigDecimal costPerDay;

    public int getBedsTypeID() {
        return bedsTypeID;
    }

    public void setBedsTypeID(int bedsTypeID) {
        this.bedsTypeID = bedsTypeID;
    }

    public int getRoomClassID() {
        return roomClassID;
    }

    public void setRoomClassID(int roomClassID) {
        this.roomClassID = roomClassID;
    }

    public int getRoomInfoID() {
        return roomInfoID;
    }

    public void setRoomInfoID(int roomInfoID) {
        this.roomInfoID = roomInfoID;
    }

    public BigDecimal getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(BigDecimal costPerDay) {
        this.costPerDay = costPerDay;
    }
}

package com.epam.training.dataaccess.model;

import java.math.BigDecimal;

/**
 * Created by Mao Shaco on 11/19/2015.
 */
public class Room extends AbstractDataObject {
    private BedsType bedsType;
    private RoomClass roomClass;
    private RoomInfo roomInfo;
    private BigDecimal costPerDay;

    public BedsType getBedsType() {
        return bedsType;
    }

    public void setBedsType(BedsType bedsType) {
        this.bedsType = bedsType;
    }

    public RoomClass getRoomClass() {
        return roomClass;
    }

    public void setRoomClass(RoomClass roomClass) {
        this.roomClass = roomClass;
    }

    public RoomInfo getRoomInfo() {
        return roomInfo;
    }

    public void setRoomInfoID(RoomInfo roomInfo) {
        this.roomInfo = roomInfo;
    }

    public BigDecimal getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(BigDecimal costPerDay) {
        this.costPerDay = costPerDay;
    }
}

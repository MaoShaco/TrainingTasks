package com.epam.training.dataaccess.model;

import java.math.BigDecimal;

/**
 * Created by Mao Shaco on 11/19/2015.
 */
public class Room extends AbstractDataObject {
    private Long bedsTypeId;
    private Long roomClassId;
    private Long roomInfoId;
    private BigDecimal costPerDay;

    public Long getBedsTypeId() {
        return bedsTypeId;
    }

    public void setBedsTypeId(Long bedsTypeId) {
        this.bedsTypeId = bedsTypeId;
    }

    public Long getRoomClassId() {
        return roomClassId;
    }

    public void setRoomClassId(Long roomClassId) {
        this.roomClassId = roomClassId;
    }

    public Long getRoomInfoId() {
        return roomInfoId;
    }

    public void setRoomInfoID(Long roomInfo) {
        this.roomInfoId = roomInfo;
    }

    public BigDecimal getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(BigDecimal costPerDay) {
        this.costPerDay = costPerDay;
    }
}

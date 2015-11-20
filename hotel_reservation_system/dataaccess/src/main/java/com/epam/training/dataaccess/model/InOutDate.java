package com.epam.training.dataaccess.model;

import java.util.Date;

/**
 * Created by Mao Shaco on 11/19/2015.
 */
public class InOutDate extends AbstractDataObject {
    private Date entryDate;
    private Date outDate;

    public Date getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }

    public Date getOutDate() {
        return outDate;
    }

    public void setOutDate(Date outDate) {
        this.outDate = outDate;
    }
}

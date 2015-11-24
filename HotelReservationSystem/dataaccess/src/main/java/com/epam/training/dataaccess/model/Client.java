package com.epam.training.dataaccess.model;

/**
 * Created by Mao Shaco on 11/15/2015.
 */
public class Client extends AbstractDataObject {

    private String clientName;
    private Long clientInfoId;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Long getClientInfoId() {
        return clientInfoId;
    }

    public void setClientInfoId(Long clientInfoId) {
        this.clientInfoId = clientInfoId;
    }

    @Override
    public String toString() {
        return getClientName() + " " + getClientInfoId().toString();
    }
}


package com.epam.training.dataaccess.model;

/**
 * Created by Mao Shaco on 11/15/2015.
 */
public class Client extends AbstractDataObject {

    private String clientName;
    private ClientInfo clientInfo;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }
}


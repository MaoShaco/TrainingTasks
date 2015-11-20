package com.epam.training.dataaccess.model;

/**
 * Created by Mao Shaco on 11/19/2015.
 */
public class ClientInfo extends AbstractDataObject {
    private String creditCardNumber;

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}

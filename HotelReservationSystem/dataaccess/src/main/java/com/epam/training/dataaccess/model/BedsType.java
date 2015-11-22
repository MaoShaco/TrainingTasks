package com.epam.training.dataaccess.model;

/**
 * Created by Mao Shaco on 11/19/2015.
 */
public class BedsType extends AbstractDataObject {
    private Long id;
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

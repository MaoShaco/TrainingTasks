package com.epam.training.dataaccess.model;

/**
 * Created by Mao Shaco on 11/19/2015.
 */
public abstract class AbstractDataObject {
    protected Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

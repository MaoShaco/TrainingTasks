package com.epam.training.services.ServicesExceptions;

import java.util.Arrays;

/**
 * Created by Mao Shaco on 11/29/2015.
 */
public class NoSuchDataInDao extends Exception {
    private String interestedData;
    private Object[] parameters;

    public NoSuchDataInDao(){}

    public NoSuchDataInDao(String interestedData, Object... parameters){
        this.interestedData = interestedData;
        this.parameters = parameters;
    }

    @Override
    public String getMessage(){
        return String.format("There is no %s object with interested parameters: %s", interestedData, Arrays.toString(parameters));
    }

}

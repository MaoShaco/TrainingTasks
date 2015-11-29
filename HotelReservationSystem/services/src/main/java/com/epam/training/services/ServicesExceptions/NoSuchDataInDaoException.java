package com.epam.training.services.ServicesExceptions;

import java.util.Arrays;

/**
 * Created by Mao Shaco on 11/29/2015.
 */
public class NoSuchDataInDaoException extends Exception {
    private String interestedData;
    private Object[] parameters;

    public NoSuchDataInDaoException(String interestedData, Object... parameters){
        this.interestedData = interestedData;
        this.parameters = parameters;
    }

    @Override
    public String getMessage(){
        return String.format("There is no %s object with interested parameters: %s in dao", interestedData, Arrays.toString(parameters));
    }

}

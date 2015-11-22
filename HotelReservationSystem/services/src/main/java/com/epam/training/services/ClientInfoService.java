package com.epam.training.services;

import com.epam.training.dataaccess.model.ClientInfo;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
public interface ClientInfoService {
    void registerClient(String creditCardNumber);

    ClientInfo get(Long id) throws InstantiationException, IllegalAccessException;
}

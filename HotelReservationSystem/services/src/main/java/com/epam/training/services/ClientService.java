package com.epam.training.services;

import com.epam.training.dataaccess.model.Client;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
public interface ClientService {
    void registerClient(String name, Long clientInfoId);

    Client get(Long id) throws InstantiationException, IllegalAccessException;

    public void updateClient(Long id, Client client);
}

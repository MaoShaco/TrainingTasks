package com.epam.training.services;

import com.epam.training.dataaccess.model.Client;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
public interface ClientService extends GenericInsertOrUpdateService<Client> {
    void registerClient(String name, String creditCardNumber);
}

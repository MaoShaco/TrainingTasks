package com.epam.training.services.impl;

import com.epam.training.dataaccess.dao.ClientDao;
import com.epam.training.dataaccess.model.Client;
import com.epam.training.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientDao clientDao;

    @Override
    public void registerClient(String name, Long clientInfoId) {
        Client client = new Client();

        client.setClientInfoId(clientInfoId);
        client.setClientName(name);
        clientDao.insert(client);
    }

    @Override
    public Client get(Long id) throws InstantiationException, IllegalAccessException {
        return clientDao.getById(id);
    }

    @Override
    public void updateClient(Long id, Client client) {
        clientDao.update(id, client);
    }

}

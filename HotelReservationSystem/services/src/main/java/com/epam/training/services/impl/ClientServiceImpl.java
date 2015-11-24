package com.epam.training.services.impl;

import com.epam.training.dataaccess.dao.ClientDao;
import com.epam.training.dataaccess.dao.GenericDao;
import com.epam.training.dataaccess.model.Client;
import com.epam.training.dataaccess.model.ClientInfo;
import com.epam.training.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
@Service
public class ClientServiceImpl extends GenericInsertOrUpdateServiceImpl<Client> implements ClientService {

    @Autowired
    private ClientDao clientDao;

    @Override
    protected GenericDao<Client> getBeanDao() {
        return clientDao;
    }

    @Override
    public void registerClient(String name, String creditCardNumber) {
        Client client = new Client();

        ClientInfo  clientInfo = new ClientInfo();
        clientInfo.setCreditCardNumber(creditCardNumber);

        client.setClientInfoId(new ClientInfoServiceImpl().getBeanDao().insert(clientInfo));
        client.setClientName(name);
        clientDao.insert(client);
    }
}

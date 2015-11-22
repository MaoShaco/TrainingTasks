package com.epam.training.services.impl;

import com.epam.training.dataaccess.dao.ClientInfoDao;
import com.epam.training.dataaccess.model.ClientInfo;
import com.epam.training.services.ClientInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
@Service
public class ClientInfoServiceImpl implements ClientInfoService {

    @Autowired
    private ClientInfoDao clientInfoDao;

    @Override
    public void registerClient(String creditCardNumber) {
        ClientInfo client = new ClientInfo();

        client.setCreditCardNumber(creditCardNumber);
        clientInfoDao.insert(client);
    }

    @Override
    public ClientInfo get(Long id) throws InstantiationException, IllegalAccessException {
        return clientInfoDao.getById(id);
    }
}

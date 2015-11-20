package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.ClientDao;
import com.epam.training.dataaccess.model.Client;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/19/2015.
 */
public class ClientDaoImpl implements ClientDao {

    public static long ID_GEN;

    private static Map<Long, Client> TABLE_CLIENT = new HashMap<>();

    @Override
    public Client getById(Long id) {
        return TABLE_CLIENT.get(id);
    }

    @Override
    public void insert(Client client) {
        client.setId(ID_GEN++);
        TABLE_CLIENT.put(client.getId(), client);
    }

    @Override
    public void update(Client obj) {

    }
}

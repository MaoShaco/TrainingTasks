package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.ClientInfoDao;
import com.epam.training.dataaccess.model.ClientInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
public class ClientInfoDaoImpl implements ClientInfoDao {

    public static long ID_GEN;

    private static Map<Long, ClientInfo> TABLE_CLIENT_INFO = new HashMap<>();

    @Override
    public ClientInfo getById(Long id) {
        return TABLE_CLIENT_INFO.get(id);
    }

    @Override
    public void insert(ClientInfo clientInfo) {
        clientInfo.setId(ID_GEN++);
        TABLE_CLIENT_INFO.put(clientInfo.getId(), clientInfo);
    }

    @Override
    public void update(ClientInfo obj) {

    }
}

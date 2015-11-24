package com.epam.training.services.impl;

import com.epam.training.dataaccess.dao.ClientInfoDao;
import com.epam.training.dataaccess.dao.GenericDao;
import com.epam.training.dataaccess.model.ClientInfo;
import com.epam.training.services.ClientInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
@Service
public class ClientInfoServiceImpl extends GenericInsertOrUpdateServiceImpl<ClientInfo> implements ClientInfoService {

    @Autowired
    private ClientInfoDao clientInfoDao;

    @Override
    public GenericDao<ClientInfo> getBeanDao() {
        return clientInfoDao;
    }
}

package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.ClientInfoDao;
import com.epam.training.dataaccess.model.ClientInfo;
import org.springframework.stereotype.Repository;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
@Repository
public class ClientInfoDaoImpl extends GenericDaoImpl<ClientInfo> implements ClientInfoDao {

    protected ClientInfoDaoImpl() {
        super("client_info", ClientInfo.class);
    }

    @Override
    public Object[] paramsGets(ClientInfo obj) {
        return new Object[]{obj.getCreditCardNumber()};
    }

    @Override
    protected String getSqlForInsert() {
        return String.format("INSERT INTO %s (credit_card_number) VALUES (?)", tableName);
    }
}

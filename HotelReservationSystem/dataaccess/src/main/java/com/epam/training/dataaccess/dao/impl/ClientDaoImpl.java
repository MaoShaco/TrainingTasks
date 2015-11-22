package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.ClientDao;
import com.epam.training.dataaccess.model.Client;
import org.springframework.stereotype.Repository;

/**
 * Created by Mao Shaco on 11/19/2015.
 */
@Repository
public class ClientDaoImpl extends GenericDaoImpl<Client> implements ClientDao {

    protected ClientDaoImpl() {
        super("client", Client.class);
    }

    @Override
    protected String getSqlForInsert() {
        return String.format("INSERT INTO %s (client_name, client_info_id) VALUES (?,?)", tableName);
    }



    @Override
    public Object[] paramsGets(Client obj) {
        return new Object[]{obj.getClientName(), obj.getClientInfoId()};
    }
}

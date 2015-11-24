package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.ClientInfoDao;
import com.epam.training.dataaccess.model.ClientInfo;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
@Repository
public class ClientInfoDaoImpl extends GenericDaoImpl<ClientInfo> implements ClientInfoDao {

    protected ClientInfoDaoImpl() {
        super("client_info", ClientInfo.class);
    }

    @Override
    protected Map<String, Object> getParametersForInsert(ClientInfo entity) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("credit_card_number", entity.getCreditCardNumber());
        return parameters;
    }
}

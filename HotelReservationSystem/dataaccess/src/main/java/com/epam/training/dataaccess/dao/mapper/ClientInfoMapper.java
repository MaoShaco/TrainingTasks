package com.epam.training.dataaccess.dao.mapper;

import com.epam.training.dataaccess.model.ClientInfo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
public class ClientInfoMapper implements RowMapper<ClientInfo> {
    @Override
    public ClientInfo mapRow(ResultSet resultSet, int i) throws SQLException {
        Long id = resultSet.getLong("id");
        String creditCardNumber = resultSet.getString("credit_card_number");
        ClientInfo clientInfo = new ClientInfo();
        clientInfo.setId(id);
        clientInfo.setCreditCardNumber(creditCardNumber);
        return clientInfo;
    }
}

package com.epam.training.dataaccess.dao.mapper;

import com.epam.training.dataaccess.model.Client;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
public class ClientMapper implements RowMapper<Client> {
    @Override
    public Client mapRow(ResultSet resultSet, int i) throws SQLException {
        Long id = resultSet.getLong("id");
        Long clientInfoId = resultSet.getLong("client_info_id");
        String clientName = resultSet.getString("client_name");
        Client client = new Client();
        client.setId(id);
        client.setClientInfoId(clientInfoId);
        client.setClientName(clientName);
        return client;
    }

}

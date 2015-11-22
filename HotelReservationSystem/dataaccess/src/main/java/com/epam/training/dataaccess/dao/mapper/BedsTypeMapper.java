package com.epam.training.dataaccess.dao.mapper;

import com.epam.training.dataaccess.model.BedsType;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
public class BedsTypeMapper implements RowMapper<BedsType> {
    @Override
    public BedsType mapRow(ResultSet resultSet, int i) throws SQLException {
        Long id = resultSet.getLong("id");
        String type = resultSet.getString("type");
        BedsType clientInfo = new BedsType();
        clientInfo.setId(id);
        clientInfo.setType(type);
        return clientInfo;
    }
}

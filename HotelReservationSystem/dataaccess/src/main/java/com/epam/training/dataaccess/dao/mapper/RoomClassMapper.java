package com.epam.training.dataaccess.dao.mapper;

import com.epam.training.dataaccess.model.RoomClass;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
public class RoomClassMapper implements RowMapper<RoomClass> {
    @Override
    public RoomClass mapRow(ResultSet resultSet, int i) throws SQLException {
        Long id = resultSet.getLong("id");
        String className = resultSet.getString("class_name");
        RoomClass roomClass = new RoomClass();
        roomClass.setId(id);
        roomClass.setClassName(className);
        return roomClass;
    }
}

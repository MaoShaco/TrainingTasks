package com.epam.training.dataaccess.dao.mapper;

import com.epam.training.dataaccess.model.RoomInfo;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
public class RoomInfoMapper implements RowMapper<RoomInfo> {
    @Override
    public RoomInfo mapRow(ResultSet resultSet, int i) throws SQLException {
        Long id = resultSet.getLong("id");
        Long roomNumber = resultSet.getLong("room_number");
        RoomInfo roomInfo = new RoomInfo();
        roomInfo.setId(id);
        roomInfo.setRoomNumber(roomNumber);
        return roomInfo;
    }
}

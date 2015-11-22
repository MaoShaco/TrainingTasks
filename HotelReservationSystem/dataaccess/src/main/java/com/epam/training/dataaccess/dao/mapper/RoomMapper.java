package com.epam.training.dataaccess.dao.mapper;

import com.epam.training.dataaccess.model.Room;
import org.springframework.jdbc.core.RowMapper;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
public class RoomMapper implements RowMapper<Room> {
    @Override
         public Room mapRow(ResultSet resultSet, int i) throws SQLException {
        Long id = resultSet.getLong("id");
        Long bedsTypeId = resultSet.getLong("beds_type_id");
        BigDecimal costPerDay = resultSet.getBigDecimal("cost_per_day");
        Long roomClassId = resultSet.getLong("room_class_id");
        Long roomInfoId = resultSet.getLong("room_info_id");
        Room room = new Room();
        room.setId(id);
        room.setBedsTypeId(bedsTypeId);
        room.setCostPerDay(costPerDay);
        room.setRoomClassId(roomClassId);
        room.setRoomInfoId(roomInfoId);
        return room;
    }
}

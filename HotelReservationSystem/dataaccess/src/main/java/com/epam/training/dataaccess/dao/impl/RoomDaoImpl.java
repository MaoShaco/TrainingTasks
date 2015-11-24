package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.RoomDao;
import com.epam.training.dataaccess.model.BedsType;
import com.epam.training.dataaccess.model.Room;
import com.epam.training.dataaccess.model.RoomClass;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
@Repository
public class RoomDaoImpl extends ExtendedGenericGetAllDaoImpl<Room> implements RoomDao {

    protected RoomDaoImpl() {
        super("room", Room.class);
    }

    @Override
    protected Map<String, Object> getParametersForInsert(Room entity) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("beds_type_id", entity.getBedsTypeId());
        parameters.put("room_class_id", entity.getRoomClassId());
        parameters.put("room_info_id", entity.getRoomInfoId());
        parameters.put("cost_per_day", entity.getCostPerDay());
        return parameters;
    }

    @Override
    public List<Room> getFreeRoomsOnDate(Date entryDate, Date outDate, BedsType bedsType) {
        return jdbcTemplate.query("SELECT * FROM room WHERE beds_type_id = ? AND id NOT IN " +
                        "(SELECT room_id FROM orders WHERE in_out_date_id IN " +
                        "(SELECT id FROM in_out_date WHERE entry_date <= ? AND date_out >= ?))",
                new Object[]{bedsType.getId(), outDate.getTime(), entryDate.getTime()},
                new BeanPropertyRowMapper<>(Room.class));
    }

    @Override
    public List<Room> getFreeRoomsOnDate(Date entryDate, Date outDate, RoomClass roomClass, BedsType bedsType) {
        return jdbcTemplate.query("SELECT * FROM room WHERE room_class_id = ? AND beds_type_id = ? AND id NOT IN " +
                        "(SELECT room_id FROM orders WHERE in_out_date_id IN " +
                        "(SELECT id FROM in_out_date WHERE entry_date <= ? AND date_out >= ?))",
                new Object[]{roomClass.getId(), bedsType.getId(), outDate.getTime(), entryDate.getTime()},
                new BeanPropertyRowMapper<>(Room.class));
    }

    @Override
    public List<Room> getRoomsOnRoomClass(RoomClass roomClass) {
        return jdbcTemplate.query("SELECT * FROM room WHERE room_class_id = ?",
                new Object[]{roomClass.getId()},
                new BeanPropertyRowMapper<>(Room.class));
    }

    @Override
    public List<Room> getRoomsOnBedsType(BedsType bedsType) {
        return jdbcTemplate.query("SELECT * FROM room WHERE beds_type_id = ?",
                new Object[]{bedsType.getId()},
                new BeanPropertyRowMapper<>(Room.class));
    }

    @Override
    public Room findRoomByNumber(Long roomNumber) {
        return jdbcTemplate.queryForObject("SELECT * FROM room WHERE room_info_id = " +
                        "(SELECT id FROM room_info WHERE room_number = ?)",
                new Object[]{roomNumber},
                new BeanPropertyRowMapper<>(Room.class));
    }
}

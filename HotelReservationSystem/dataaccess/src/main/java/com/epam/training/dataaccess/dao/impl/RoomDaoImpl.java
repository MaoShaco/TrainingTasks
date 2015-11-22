package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.model.Room;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
@Repository
public class RoomDaoImpl extends GenericDaoImpl<Room>{

    protected RoomDaoImpl() {
        super("room", Room.class);
    }

    @Override
    protected Map<String, Object> getParametersForInsert(Room entity) {
        return null;
    }
    /*@Override
    protected String getSqlForInsert() {
        return String.format("INSERT INTO %s (beds_type_id, room_class_id, room_info_id, cost_per_day) VALUES (?,?,?,?)", tableName);
    }
    @Override
    public Object[] paramsGets(Room obj) {
        return new Object[]{obj.getBedsTypeId(), obj.getRoomClassId(), obj.getRoomInfoId(), obj.getCostPerDay()};
    }*/
}

package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.model.RoomInfo;
import org.springframework.stereotype.Repository;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
@Repository
public class RoomInfoDaoImpl extends GenericDaoImpl<RoomInfo> {

    protected RoomInfoDaoImpl() {
        super("room_info", RoomInfo.class);
    }

    @Override
    protected String getSqlForInsert() {
        return String.format("INSERT INTO %s (room_number) VALUES (?)", tableName);
    }

    @Override
    public Object[] paramsGets(RoomInfo obj) {
        return new Object[]{obj.getRoomNumber()};
    }
}

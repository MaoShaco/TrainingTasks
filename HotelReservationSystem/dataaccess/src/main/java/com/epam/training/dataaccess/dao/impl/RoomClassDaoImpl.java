package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.model.RoomClass;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
@Repository
public class RoomClassDaoImpl extends GenericDaoImpl<RoomClass> {


    protected RoomClassDaoImpl() {
        super("room_class", RoomClass.class);
    }

    @Override
    protected Map<String, Object> getParametersForInsert(RoomClass entity) {
        return null;
    }

    /*@Override
    protected String getSqlForInsert() {
        return String.format("INSERT INTO %s (class_name) VALUES (?)", tableName);
    }

    @Override
    public Object[] paramsGets(RoomClass obj) {
        return new Object[]{obj.getClassName()};
    }*/
}

package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.RoomClassDao;
import com.epam.training.dataaccess.model.RoomClass;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
@Repository
public class RoomClassDaoImpl extends ExtendedGenericGetAllDaoImpl<RoomClass> implements RoomClassDao {


    protected RoomClassDaoImpl() {
        super("room_class", RoomClass.class);
    }

    @Override
    protected Map<String, Object> getParametersForInsert(RoomClass entity) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("class_name", entity.getClassName());
        return parameters;
    }
}

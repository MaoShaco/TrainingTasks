package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.RoomInfoDao;
import com.epam.training.dataaccess.model.RoomInfo;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
@Repository
public class RoomInfoDaoImpl extends GenericDaoImpl<RoomInfo> implements RoomInfoDao {

    protected RoomInfoDaoImpl() {
        super("room_info", RoomInfo.class);
    }

    @Override
    protected Map<String, Object> getParametersForInsert(RoomInfo entity) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("room_number", entity.getRoomNumber());
        return parameters;
    }
}

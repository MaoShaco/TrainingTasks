package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.InOutDateDao;
import com.epam.training.dataaccess.model.InOutDate;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
public class InOutDateDaoImpl implements InOutDateDao {

    public static long ID_GEN;

    private static Map<Long, InOutDate> TABLE_IN_OUT_DATE = new HashMap<>();

    @Override
    public InOutDate getById(Long id) {
        return TABLE_IN_OUT_DATE.get(id);
    }

    @Override
    public void insert(InOutDate inOutDate) {
        inOutDate.setId(ID_GEN++);
        TABLE_IN_OUT_DATE.put(inOutDate.getId(), inOutDate);
    }

    @Override
    public void update(InOutDate obj) {

    }
}

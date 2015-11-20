package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.BedsTypeDao;
import com.epam.training.dataaccess.model.BedsType;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
public class BedsTypeDaoImpl implements BedsTypeDao {

    public static long ID_GEN;

    private static Map<Long, BedsType> TABLE_BEDS_TYPE = new HashMap<>();

    @Override
    public BedsType getById(Long id) {
        return TABLE_BEDS_TYPE.get(id);
    }

    @Override
    public void insert(BedsType bedsType) {
        bedsType.setId(ID_GEN++);
        TABLE_BEDS_TYPE.put(bedsType.getId(), bedsType);
    }

    @Override
    public void update(BedsType bedsType) {
        BedsType existingBedsType = TABLE_BEDS_TYPE.get(bedsType.getId());
        existingBedsType.setClassName(bedsType.getClassName());
    }
}

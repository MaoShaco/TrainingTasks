package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.ExtendedGenericGetAllDao;
import com.epam.training.dataaccess.model.AbstractDataObject;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

/**
 * Created by Mao Shaco on 11/24/2015.
 */
public abstract class ExtendedGenericGetAllDaoImpl<T extends AbstractDataObject> extends GenericDaoImpl<T> implements ExtendedGenericGetAllDao<T> {

    protected ExtendedGenericGetAllDaoImpl(String tableName, Class<T> typeClass) {
        super(tableName, typeClass);
    }

    @Override
    public List<T> getAll() {
        return jdbcTemplate.query(String.format("select * from %s", tableName), new BeanPropertyRowMapper<>(typeClass));
    }
}

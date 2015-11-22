package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.GenericDao;
import com.epam.training.dataaccess.model.AbstractDataObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.Map;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
public abstract class GenericDaoImpl<T extends AbstractDataObject> implements GenericDao<T> {

    //protected RowMapper<T> genericRowMapper;
    protected String tableName;
    protected Class<T> typeClass;

    @Autowired
    protected JdbcTemplate jdbcTemplate;

    protected GenericDaoImpl(String tableName, Class<T> typeClass) {
        this.tableName = tableName;
        this.typeClass = typeClass;
    }

    @Override
    public T getById(Long entityId) {
        return jdbcTemplate.queryForObject(String.format("select * from %s where id = ?", tableName),
                new Object[]{entityId}, new BeanPropertyRowMapper<>(typeClass));
    }

    /*@Override
    public T getById(Long id) {
        return jdbcTemplate.queryForObject(String.format("select * from %s where id = ?", tableName),
                new Object[]{id}, genericRowMapper);
    }*/

   /* @Override
    public void insert(T obj) {
        Object[] objectInDB = paramsGets(obj);
        jdbcTemplate.update(getSqlForInsert(), objectInDB);
    }*/

    @Override
    public void insert(T entity) {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
        jdbcInsert.withTableName(tableName).usingGeneratedKeyColumns("id");
        jdbcInsert.execute(new MapSqlParameterSource(getParametersForInsert(entity)));
    }

    protected abstract Map<String, Object> getParametersForInsert(T entity);

    //protected abstract String getSqlForInsert();

    //protected abstract Object[] paramsGets(T obj);

}

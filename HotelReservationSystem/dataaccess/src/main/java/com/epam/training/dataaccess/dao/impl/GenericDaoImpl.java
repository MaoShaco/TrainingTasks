package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.GenericDao;
import com.epam.training.dataaccess.model.AbstractDataObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
public abstract class GenericDaoImpl<T extends AbstractDataObject> implements GenericDao<T> {

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

    protected abstract Map<String, Object> getParametersForInsert(T entity);

    @Override
    public void insert(T entity) {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
        jdbcInsert.withTableName(tableName).usingGeneratedKeyColumns("id");
        jdbcInsert.execute(new MapSqlParameterSource(getParametersForInsert(entity)));
    }

    @Override
    public void update(Long id, T entity){
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
        jdbcTemplate.update(String.format("delete from %s where id = ?", tableName), id);
        Map<String, Object> mapParameters = new HashMap<>(getParametersForInsert(entity));
        mapParameters.put("id", id);
        jdbcInsert.withTableName(tableName);
        jdbcInsert.execute(new MapSqlParameterSource(mapParameters));
    }
}

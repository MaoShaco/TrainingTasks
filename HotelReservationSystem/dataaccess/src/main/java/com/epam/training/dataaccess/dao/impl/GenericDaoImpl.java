package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.GenericDao;
import com.epam.training.dataaccess.model.AbstractDataObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import java.util.Iterator;
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
    public Long insert(T entity) {
        SimpleJdbcInsert jdbcInsert = new SimpleJdbcInsert(jdbcTemplate);
        jdbcInsert.withTableName(tableName).usingGeneratedKeyColumns("id");
        return jdbcInsert.executeAndReturnKey(new MapSqlParameterSource(getParametersForInsert(entity)))
                .longValue();
    }

    @Override
    public void update(T entity) {
        StringBuilder updatingParameters = new StringBuilder();

        Map<String, Object> parametersForInsert = getParametersForInsert(entity);
        Iterator<Map.Entry<String, Object>> iterator = parametersForInsert.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Object> parameter = iterator.next();
            if (parameter.getValue() != null) {
                updatingParameters.append(String.format("%s=?, ", parameter.getKey()));
            } else {
                iterator.remove();
            }
        }
        try {
            updatingParameters.deleteCharAt(updatingParameters.lastIndexOf(","));
        } catch (StringIndexOutOfBoundsException e) {
            return;
        }
        jdbcTemplate.update(String.format("update %s set %s where id = %s", tableName, updatingParameters, entity.getId()), parametersForInsert.values().toArray());

    }
}

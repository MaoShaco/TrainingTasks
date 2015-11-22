package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.model.BedsType;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
@Repository
public class BedsTypeDaoImpl extends GenericDaoImpl<BedsType> {

    protected BedsTypeDaoImpl() {
        super("beds_type", BedsType.class);
    }

    @Override
    protected Map<String, Object> getParametersForInsert(BedsType entity) {
        return null;
    }

   /* @Override
    protected String getSqlForInsert() {
        return String.format("INSERT INTO %s (beds_type) VALUES (?)", tableName);
    }

    @Override
    public Object[] paramsGets(BedsType obj) {
        return new Object[]{obj.getType()};
    }*/
}

package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.BedsTypeDao;
import com.epam.training.dataaccess.model.BedsType;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
@Repository
public class BedsTypeDaoImpl extends ExtendedGenericGetAllDaoImpl<BedsType> implements BedsTypeDao {

    protected BedsTypeDaoImpl() {
        super("beds_type", BedsType.class);
    }

    @Override
    protected Map<String, Object> getParametersForInsert(BedsType entity) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("beds_type", entity.getType());
        return parameters;
    }

}

package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.InOutDateDao;
import com.epam.training.dataaccess.model.InOutDate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
@Repository
public class InOutDateDaoImpl extends GenericDaoImpl<InOutDate> implements InOutDateDao {

    protected InOutDateDaoImpl() {
        super("in_out_date", InOutDate.class);
    }

    @Override
    protected Map<String, Object> getParametersForInsert(InOutDate entity) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("entry_date", entity.getEntryDate());
        parameters.put("out_date", entity.getOutDate());
        return parameters;
    }
}

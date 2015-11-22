package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.model.InOutDate;
import org.springframework.stereotype.Repository;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
@Repository
public class InOutDateDaoImpl extends GenericDaoImpl<InOutDate> {

    protected InOutDateDaoImpl() {
        super("in_out_date", InOutDate.class);
    }

    @Override
    protected String getSqlForInsert() {
        return String.format("INSERT INTO %s (entry_date, out_date) VALUES (?,?)", tableName);
    }

    @Override
    public Object[] paramsGets(InOutDate obj) {
        return new Object[]{obj.getEntryDate(), obj.getOutDate()};
    }
}

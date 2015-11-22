package com.epam.training.dataaccess.dao.mapper;

import com.epam.training.dataaccess.model.InOutDate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
public class InOutDateMapper implements RowMapper<InOutDate> {
    @Override
    public InOutDate mapRow(ResultSet resultSet, int i) throws SQLException {
        Long id = resultSet.getLong("id");
        Date entryDate = resultSet.getDate("entry_date");
        Date outDate = resultSet.getDate("out_date");
        InOutDate inOutDate = new InOutDate();
        inOutDate.setId(id);
        inOutDate.setEntryDate(entryDate);
        inOutDate.setOutDate(outDate);
        return inOutDate;
    }
}

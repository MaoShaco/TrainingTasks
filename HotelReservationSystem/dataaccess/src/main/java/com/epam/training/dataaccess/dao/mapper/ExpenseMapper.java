package com.epam.training.dataaccess.dao.mapper;

import com.epam.training.dataaccess.model.Expense;
import org.springframework.jdbc.core.RowMapper;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
public class ExpenseMapper implements RowMapper<Expense> {
    @Override
    public Expense mapRow(ResultSet resultSet, int i) throws SQLException {
        Long id = resultSet.getLong("id");
        BigDecimal totalExpense = resultSet.getBigDecimal("total_expense");
        Expense expense = new Expense();
        expense.setId(id);
        expense.setTotalExpense(totalExpense);
        return expense;
    }
}

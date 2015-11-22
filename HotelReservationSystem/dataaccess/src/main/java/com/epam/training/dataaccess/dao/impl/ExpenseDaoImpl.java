package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.model.Expense;
import org.springframework.stereotype.Repository;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
@Repository
public class ExpenseDaoImpl extends GenericDaoImpl<Expense> {

    protected ExpenseDaoImpl() {
        super("expense", Expense.class);
    }

    @Override
    protected String getSqlForInsert() {
        return String.format("INSERT INTO %s (total_expense) VALUES (?)", tableName);
    }

    @Override
    public Object[] paramsGets(Expense obj) {
        return new Object[]{obj.getTotalExpense()};
    }
}

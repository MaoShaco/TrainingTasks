package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.ExpenseDao;
import com.epam.training.dataaccess.model.Expense;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
@Repository
public class ExpenseDaoImpl extends GenericDaoImpl<Expense> implements ExpenseDao {

    protected ExpenseDaoImpl() {
        super("expense", Expense.class);
    }

    @Override
    protected Map<String, Object> getParametersForInsert(Expense entity) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("total_expense", entity.getTotalExpense());
        return parameters;
    }

}

package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.ExpenseDao;
import com.epam.training.dataaccess.model.Expense;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
public class ExpenseDaoImpl implements ExpenseDao {

    public static long ID_GEN;

    private static Map<Long, Expense> TABLE_EXPENSE = new HashMap<>();

    @Override
    public Expense getById(Long id) {
        return TABLE_EXPENSE.get(id);
    }

    @Override
    public void insert(Expense expense) {
        expense.setId(ID_GEN++);
        TABLE_EXPENSE.put(expense.getId(), expense);
    }

    @Override
    public void update(Expense obj) {

    }
}

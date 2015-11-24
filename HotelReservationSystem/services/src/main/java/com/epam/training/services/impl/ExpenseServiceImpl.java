package com.epam.training.services.impl;

import com.epam.training.dataaccess.dao.ExpenseDao;
import com.epam.training.dataaccess.dao.GenericDao;
import com.epam.training.dataaccess.model.Expense;
import com.epam.training.services.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Mao Shaco on 11/25/2015.
 */
@Service
public class ExpenseServiceImpl extends GenericInsertOrUpdateServiceImpl<Expense> implements ExpenseService {

    @Autowired
    private ExpenseDao expenseDao;

    @Override
    protected GenericDao<Expense> getBeanDao() {
        return expenseDao;
    }
}

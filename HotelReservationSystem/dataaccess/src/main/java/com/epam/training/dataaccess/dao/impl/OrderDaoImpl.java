package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.model.Order;
import org.springframework.stereotype.Repository;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
@Repository
public class OrderDaoImpl extends GenericDaoImpl<Order> {


    protected OrderDaoImpl() {
        super("order_table", Order.class);
    }

    @Override
    protected String getSqlForInsert() {
        return String.format("INSERT INTO %s (room_id, in_out_date, expense_id, order_date, client_id) VALUES (?,?,?,?,?)", tableName);
    }

    @Override
    public Object[] paramsGets(Order obj) {
        return new Object[]{obj.getRoomId(), obj.getInOutDateId(), obj.getExpenseId(), obj.getOrderDate(), obj.getClientId()};
    }
}

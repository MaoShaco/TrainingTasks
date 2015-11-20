package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.OrderDao;
import com.epam.training.dataaccess.model.Order;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
public class OrderDaoImpl implements OrderDao {

    public static long ID_GEN;

    private static Map<Long, Order> TABLE_ORDER = new HashMap<>();

    @Override
    public Order getById(Long id) {
        return TABLE_ORDER.get(id);
    }

    @Override
    public void insert(Order order) {
        order.setId(ID_GEN++);
        TABLE_ORDER.put(order.getId(), order);
    }

    @Override
    public void update(Order obj) {

    }
}

package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.OrderDao;
import com.epam.training.dataaccess.model.Client;
import com.epam.training.dataaccess.model.Order;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.*;

/**
 * Created by Mao Shaco on 11/20/2015.
 */
@Repository
public class OrderDaoImpl extends GenericDaoImpl<Order> implements OrderDao {


    protected OrderDaoImpl() {
        super("orders", Order.class);
    }

    @Override
    protected Map<String, Object> getParametersForInsert(Order entity) {
        entity.setOrderDate(Calendar.getInstance().getTime());
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("room_id", entity.getRoomId());
        parameters.put("in_out_date_id", entity.getInOutDateId());
        parameters.put("expense_id", entity.getExpenseId());
        parameters.put("order_date", entity.getOrderDate());
        parameters.put("client_id", entity.getClientId());
        return parameters;
    }


    @Override
    public List<Order> getClientOrders(Client currentClient) {
        return jdbcTemplate.query("SELECT * FROM orders WHERE client_id = ?",
                new Object[]{currentClient.getId()},
                new BeanPropertyRowMapper<>(Order.class));
    }
}

package com.epam.training.dataaccess.dao.mapper;

import com.epam.training.dataaccess.model.Order;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
public class OrderMapper implements RowMapper<Order> {
    @Override
    public Order mapRow(ResultSet resultSet, int i) throws SQLException {
        Long id = resultSet.getLong("id");
        Long roomId = resultSet.getLong("room_id");
        Long inOutDateId = resultSet.getLong("in_out_date_id");
        Long expenseId = resultSet.getLong("expense_id");
        Long clientId = resultSet.getLong("client_id");
        Date orderDate = resultSet.getDate("order_date");
        Order order = new Order();
        order.setId(id);
        order.setExpenseId(expenseId);
        order.setInOutDateId(inOutDateId);
        order.setRoomId(roomId);
        order.setClientId(clientId);
        order.setOrderDate(orderDate);
        return order;
    }
}

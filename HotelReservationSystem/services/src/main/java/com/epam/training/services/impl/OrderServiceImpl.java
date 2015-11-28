package com.epam.training.services.impl;

import com.epam.training.dataaccess.dao.ExpenseDao;
import com.epam.training.dataaccess.dao.GenericDao;
import com.epam.training.dataaccess.dao.InOutDateDao;
import com.epam.training.dataaccess.dao.OrderDao;
import com.epam.training.dataaccess.model.*;
import com.epam.training.services.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * Created by Mao Shaco on 11/25/2015.
 */
@Service
public class OrderServiceImpl extends GenericInsertOrUpdateServiceImpl<Order> implements OrderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderServiceImpl.class);

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private InOutDateDao inOutDateDao;
    @Autowired
    private ExpenseDao expenseDao;

    @Override
    protected GenericDao<Order> getBeanDao() {
        return orderDao;
    }

    @Override
    public void registerNewOrder(Client client, Room room, Date entryDate, Date outDate) {

        Order order = new Order();

        int oneDay = 24 * 60 * 60 * 1000;

        InOutDate inOutDate = new InOutDate();
        inOutDate.setEntryDate(entryDate);
        inOutDate.setOutDate(outDate);
        BigDecimal dateDifference = new BigDecimal(Math.round(Math.abs((outDate.getTime() - entryDate.getTime()) / oneDay)) + 1);

        LOGGER.debug("Counting BigDecimal for date difference");

        Expense expense = new Expense();
        expense.setTotalExpense(room.getCostPerDay().multiply(dateDifference));

        order.setClientId(client.getId());
        order.setInOutDateId(inOutDateDao.insert(inOutDate));

        LOGGER.debug("Inserting InOutDate id: {} for registering new order", order.getInOutDateId());

        order.setRoomId(room.getId());
        order.setExpenseId(expenseDao.insert(expense));

        LOGGER.debug("Inserting Expense id: {} for registering new order", order.getExpenseId());

        long id = orderDao.insert(order);
        LOGGER.info("Registering new order id: {} into dao", id);
    }

    @Override
    public List<Order> getClientOrders(Client interestedClient) {
        LOGGER.info("Get orders for current client id: {}", interestedClient.getId());
        return orderDao.getClientOrders(interestedClient);
    }

    @Override
    public List<Order> getOrdersOnDate(Date interestedDate) {
        LOGGER.info("Get orders for current date id: {}", interestedDate);
        return orderDao.getOrdersOnDate(interestedDate);
    }


}

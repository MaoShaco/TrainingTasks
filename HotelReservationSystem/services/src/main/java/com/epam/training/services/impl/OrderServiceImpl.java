package com.epam.training.services.impl;

import com.epam.training.dataaccess.dao.GenericDao;
import com.epam.training.dataaccess.dao.OrderDao;
import com.epam.training.dataaccess.model.Client;
import com.epam.training.dataaccess.model.Order;
import com.epam.training.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Mao Shaco on 11/25/2015.
 */
@Service
public class OrderServiceImpl extends GenericInsertOrUpdateServiceImpl<Order> implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    protected GenericDao<Order> getBeanDao() {
        return orderDao;
    }

    @Override
    public List<Order> getClientOrders(Client interestedClient) {
        return orderDao.getClientOrders(interestedClient);
    }

    @Override
    public List<Order> getOrdersOnDate(Date interestedDate) {
        return orderDao.getOrdersOnDate(interestedDate);
    }


}

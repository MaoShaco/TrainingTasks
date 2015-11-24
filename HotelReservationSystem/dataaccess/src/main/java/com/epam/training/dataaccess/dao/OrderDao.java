package com.epam.training.dataaccess.dao;

import com.epam.training.dataaccess.model.Client;
import com.epam.training.dataaccess.model.Order;

import java.util.List;

/**
 * Created by Mao Shaco on 11/19/2015.
 */
public interface OrderDao extends GenericDao<Order> {
    List<Order> getClientOrders(Client currentClient);
}

package com.epam.training.services;

import com.epam.training.dataaccess.model.Client;
import com.epam.training.dataaccess.model.Order;

import java.util.Date;
import java.util.List;

/**
 * Created by Mao Shaco on 11/25/2015.
 */
public interface OrderService extends GenericInsertOrUpdateService<Order> {
    List<Order> getClientOrders(Client interestedClient);

    List<Order> getOrdersOnDate(Date interestedDate);
}

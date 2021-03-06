package com.epam.training.services;

import com.epam.training.dataaccess.model.Client;
import com.epam.training.dataaccess.model.Room;
import com.epam.training.services.ServicesExceptions.NoSuchDataInDaoException;

import java.util.Date;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
public interface ClientService extends GenericInsertOrUpdateService<Client> {

    void registerClient(String name, String creditCardNumber);

    Client findByRoomAndDate(Room room, Date date) throws NoSuchDataInDaoException;

    Client findByRoom(Room room) throws NoSuchDataInDaoException;
}

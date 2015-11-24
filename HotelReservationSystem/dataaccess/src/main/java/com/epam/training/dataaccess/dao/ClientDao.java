package com.epam.training.dataaccess.dao;

import com.epam.training.dataaccess.model.Client;
import com.epam.training.dataaccess.model.Room;

import java.util.Date;

/**
 * Created by Mao Shaco on 11/19/2015.
 */
public interface ClientDao extends GenericDao<Client> {
    Client FindClientByRoomOnDate(Room interestedRoom, Date interestedDate);
}

package com.epam.training.services.impl;

import com.epam.training.dataaccess.dao.ClientDao;
import com.epam.training.dataaccess.dao.ClientInfoDao;
import com.epam.training.dataaccess.dao.GenericDao;
import com.epam.training.dataaccess.model.Client;
import com.epam.training.dataaccess.model.ClientInfo;
import com.epam.training.dataaccess.model.Room;
import com.epam.training.services.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Mao Shaco on 11/21/2015.
 */
@Service
public class ClientServiceImpl extends GenericInsertOrUpdateServiceImpl<Client> implements ClientService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClientServiceImpl.class);

    @Autowired
    private ClientDao clientDao;

    @Autowired
    private ClientInfoDao clientInfoDao;

    @Override
    protected GenericDao<Client> getBeanDao() {
        return clientDao;
    }

    @Override
    public void registerClient(String name, String creditCardNumber) {
        Client client = new Client();

        ClientInfo clientInfo = new ClientInfo();
        clientInfo.setCreditCardNumber(creditCardNumber);

        LOGGER.debug("Creating buf ClientInfo for registering client");

        client.setClientInfoId(clientInfoDao.insert(clientInfo));
        client.setClientName(name);

        LOGGER.debug("Inserting buf ClientInfo id:{} into dao", client.getClientInfoId());

        long id = clientDao.insert(client);

        LOGGER.info("Inserting client id: {} into dao ", id);
    }

    @Override
    public Client findByRoomAndDate(Room room, Date date) {
        LOGGER.info("Getting client on room: {} at date: {} from dao", room.getId(), date);
        return clientDao.findClientByRoomOnDate(room, date);
    }

    @Override
    public Client findByRoom(Room room) {
try{
    return findByRoomAndDate(room, Calendar.getInstance().getTime());

}catch(EmptyResultDataAccessException e){
    throw new
}

    }
}

package com.epam.training.dataaccess.dao.impl;

import com.epam.training.dataaccess.dao.ClientDao;
import com.epam.training.dataaccess.model.Client;
import com.epam.training.dataaccess.model.Room;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Mao Shaco on 11/19/2015.
 */
@Repository
public class ClientDaoImpl extends GenericDaoImpl<Client> implements ClientDao {

    protected ClientDaoImpl() {
        super("client", Client.class);
    }

    @Override
    protected Map<String, Object> getParametersForInsert(Client entity) {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("client_name", entity.getClientName());
        parameters.put("client_info_id", entity.getClientInfoId());
        return parameters;
    }

    @Override
    public Client FindClientByRoomOnDate(Room interestedRoom, Date interestedDate) {
        return jdbcTemplate.queryForObject("SELECT * FROM  client WHERE id = " +
                "(SELECT client_id FROM orders WHERE room_id =? AND in_out_date_id IN " +
                        "(SELECT id FROM  in_out_date WHERE  entry_date<? AND out_date>?))",
                new Object[]{interestedRoom.getId(), interestedDate, interestedDate},
                new BeanPropertyRowMapper<>(Client.class));
    }
}

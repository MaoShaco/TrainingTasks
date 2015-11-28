package com.epam.training.services;

import com.epam.training.dataaccess.model.RoomClass;

import java.util.List;

/**
 * Created by Mao Shaco on 11/24/2015.
 */
public interface RoomClassService extends GenericInsertOrUpdateService<RoomClass> {
    List<RoomClass> getAllRoomClass();
}

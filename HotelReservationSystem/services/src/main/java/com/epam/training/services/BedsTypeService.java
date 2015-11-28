package com.epam.training.services;

import com.epam.training.dataaccess.model.BedsType;

import java.util.List;

/**
 * Created by Mao Shaco on 11/24/2015.
 */
public interface BedsTypeService extends GenericInsertOrUpdateService<BedsType> {

    List<BedsType> getAllBedsTypes();
}

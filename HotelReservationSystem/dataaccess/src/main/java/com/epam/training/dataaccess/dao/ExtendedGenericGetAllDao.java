package com.epam.training.dataaccess.dao;

import com.epam.training.dataaccess.model.AbstractDataObject;

import java.util.List;

/**
 * Created by Mao Shaco on 11/24/2015.
 */
public interface ExtendedGenericGetAllDao<T extends AbstractDataObject> extends GenericDao<T> {
    List<T> getAll();
}

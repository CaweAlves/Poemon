package com.cawe.poemon.DAO;

import com.cawe.poemon.model.ModelInterface;

public class BaseDAO implements DAOInterface {

    protected ModelInterface model;

    public BaseDAO(ModelInterface model) {
        this.model = model;
    }

    @Override
    public <T> String findById(T id) {
        return "yes";
    }

    @Override
    public <T> void findAll(T id) {

    }

    @Override
    public <T> void create(T id) {

    }

    @Override
    public <T> void update(T id) {

    }

    @Override
    public <T> void delete(T id) {

    }
}

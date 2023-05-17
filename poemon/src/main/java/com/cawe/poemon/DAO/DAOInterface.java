package com.cawe.poemon.DAO;

public interface DAOInterface {

    public <T> String findById(T id);
    public <T> void findAll(T id);
    public <T> void create(T id);
    public <T> void update(T id);
    public <T> void delete(T id);

}

package com.cawe.poemon.DAO;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {

    public Boolean isUserValid(String email, String password) {
        return true;
    }

}

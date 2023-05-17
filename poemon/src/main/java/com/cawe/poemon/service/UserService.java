package com.cawe.poemon.service;

import com.cawe.poemon.DAO.UserDAO;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public HttpStatus VerifyUserCredencials(String email, String password) {
        return new UserDAO().isUserValid(email, password) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;
    }
}

package com.cawe.poemon.controller;

import com.cawe.poemon.model.User;
import com.cawe.poemon.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    UserService service;

    @RequestMapping("/login")
    public ResponseEntity<User> login(@PathVariable String email, @PathVariable String password) {
        return new ResponseEntity<User>(service.VerifyUserCredencials(email, password));
    }

}

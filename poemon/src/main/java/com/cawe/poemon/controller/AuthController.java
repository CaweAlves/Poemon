package com.cawe.poemon.controller;

import com.cawe.poemon.dtos.AuthDto;
import com.cawe.poemon.model.User;
import com.cawe.poemon.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class AuthController {

    final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<User> login(@RequestBody @Valid AuthDto authDto) {
        var user = new User();
        BeanUtils.copyProperties(authDto, user);
        return new ResponseEntity<User>(authService.VerifyUserCredentials(user));
    }

}

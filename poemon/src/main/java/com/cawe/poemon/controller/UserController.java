package com.cawe.poemon.controller;

import com.cawe.poemon.dtos.UserDto;
import com.cawe.poemon.model.User;
import com.cawe.poemon.service.AuthService;
import com.cawe.poemon.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)

public class UserController {

    final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(path = "/user", method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<Object> saveUser(@RequestBody @Valid UserDto userDto) {
        var user = new User();
        BeanUtils.copyProperties(userDto, user);
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.save(user));
    }
}

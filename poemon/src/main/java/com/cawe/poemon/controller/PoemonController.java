package com.cawe.poemon.controller;

import com.cawe.poemon.dtos.PoemonDto;
import com.cawe.poemon.dtos.UserDto;
import com.cawe.poemon.model.Poemon;
import com.cawe.poemon.service.PoemonService;
import com.cawe.poemon.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoemonController {

    final PoemonService poemonService;

    public PoemonController(PoemonService poemonService) {
        this.poemonService = poemonService;
    }

    @RequestMapping(value = "/poemon", method = RequestMethod.POST)
    public ResponseEntity<Object> savePoemon(@RequestBody @Valid PoemonDto poemonDto) {
        var poemon = new Poemon();
        BeanUtils.copyProperties(poemonDto, poemon);
        return ResponseEntity.status(HttpStatus.CREATED).body(poemonService.save(poemon));
    }
}

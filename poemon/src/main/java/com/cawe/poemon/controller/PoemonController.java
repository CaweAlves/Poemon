package com.cawe.poemon.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoemonController {

    @RequestMapping("/poemon")
    public String index() {
        return "Teste Poemon";
    }
}

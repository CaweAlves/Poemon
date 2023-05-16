package com.cawe.poemon.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Player {
    private String name;
    private Date birth;
    private Poemon poe;
}

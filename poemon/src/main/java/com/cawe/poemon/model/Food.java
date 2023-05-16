package com.cawe.poemon.model;

import com.cawe.poemon.enums.TypeEnum;
import lombok.Getter;

import java.text.DecimalFormat;

@Getter
public class Food {
    private String name;
    private TypeEnum type;
    private String color;
    private DecimalFormat giveXP;

}

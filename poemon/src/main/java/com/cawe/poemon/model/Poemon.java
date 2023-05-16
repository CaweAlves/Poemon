package com.cawe.poemon.model;

import com.cawe.poemon.enums.TypeEnum;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
public class Poemon {
    private String name;
    private TypeEnum type;
    private String Color;
    private int Level;
    private BigDecimal xp;
    private BigDecimal nextLevel;
    public void setName(String name) {this.name = name;}

    public void setColor(String color) {
        Color = color;
    }

    public void setType(TypeEnum type) {this.type = type;}
}

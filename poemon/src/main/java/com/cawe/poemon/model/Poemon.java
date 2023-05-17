package com.cawe.poemon.model;

import com.cawe.poemon.enums.TypeEnum;
import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Entity
@Table(name = "poemon")
public class Poemon implements ModelInterface{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private TypeEnum type;
    private String Color;
    private int level;
    private BigDecimal xp;
    private BigDecimal nextLevel;
    public void setName(String name) {this.name = name;}

    public void setColor(String color) {
        Color = color;
    }

    public void setType(TypeEnum type) {this.type = type;}

}

package com.cawe.poemon.model;

import com.cawe.poemon.enums.TypeEnum;
import jakarta.persistence.*;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Entity
@Table(name = "food")
public class Food implements ModelInterface {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private TypeEnum type;
    private String color;
    private BigDecimal giveXP;
}

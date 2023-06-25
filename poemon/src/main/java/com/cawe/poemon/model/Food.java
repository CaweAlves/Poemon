package com.cawe.poemon.model;

import com.cawe.poemon.enums.TypeEnum;
import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Entity
@Table(name = "food")
public class Food implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 40)
    private String name;
    @Column(nullable = false)
    private TypeEnum type;
    @Column(nullable = false)
    private String color;
    @Column(nullable = false)
    private BigDecimal giveXP;
}

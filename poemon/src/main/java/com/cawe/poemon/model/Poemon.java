package com.cawe.poemon.model;

import com.cawe.poemon.enums.TypeEnum;
import jakarta.persistence.*;
import lombok.Getter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Entity
@Table(name = "poemon")
public class Poemon implements Serializable {
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
    private int level;
    @Column(nullable = false)
    private BigDecimal xp;
    @Column(nullable = false)
    private BigDecimal nextLevel;
    
    public void setName(String name) {this.name = name;}
    public void setColor(String color) {this.color = color;}
    public void setType(TypeEnum type) {this.type = type;}
}
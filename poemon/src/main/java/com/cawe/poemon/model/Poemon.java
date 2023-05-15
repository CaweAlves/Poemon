package com.cawe.poemon.model;

import java.text.DecimalFormat;

public class Poemon {
    private String name;
    private String Type;
    private String Color;
    private int Level;
    private DecimalFormat xp;
    private DecimalFormat nextLevel;

    public int getLevel() {
        return Level;
    }

    public DecimalFormat getXp() {
        return xp;
    }

    public DecimalFormat getNextLevel() {
        return nextLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }
}

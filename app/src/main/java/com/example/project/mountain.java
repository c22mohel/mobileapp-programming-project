package com.example.project;

import com.google.gson.annotations.SerializedName;

public class mountain {

    @SerializedName("ID")
    private String ID;
    @SerializedName("name")
    private String name;
    @SerializedName("cost")
    private int feet;
    @SerializedName("size")
    private int meter;

    public mountain(String ID, String name, int feet, int meter) {
        this.ID = ID;
        this.name = name;
        this.feet = feet;
        this.meter = meter;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public int getMeter() {
        return meter;
    }

    public void setMeter(int meter) {
        this.meter = meter;
    }
}

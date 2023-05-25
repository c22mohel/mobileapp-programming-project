package com.example.project;

import com.google.gson.annotations.SerializedName;

public class mountain {

    @SerializedName("title")
    private String title;
    @SerializedName("name")
    private String name;
    @SerializedName("cost")
    private int price;
    @SerializedName("location")
    private String location;

    public mountain(String title, String name, int price, String location) {
        this.title = title;
        this.name = name;
        this.price = price;
        this.location = location;
    }




    public String getTitle() {
        return title;
    }
    public String getname() {
        return name;
    }
    public String getlocation() {return location;}

    public int getPrice() {return price;}


}

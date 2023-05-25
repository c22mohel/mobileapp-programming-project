package com.example.project;

public class RecyclerViewItem {
    private String title;
    private String name;
    private int price;
    private String location;


    public RecyclerViewItem(String title, String location, int price, String name) {
        this.title = title;
        this.name = name;
        this.location = location;
        this.price = price;


    }


    public String getTitle() {
        return title;
    }
    public String getname() {
        return name;
    }

    public String getlocation() {
        return location;
    }
    public int getPrice() {
        return price;
    }

}

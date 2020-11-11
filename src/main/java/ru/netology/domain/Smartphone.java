package ru.netology.domain;

public class Smartphone extends Product {
    private String maker;

    public Smartphone() {

    }

    public Smartphone(int id, String name, int price, String maker) {
        super(id, name, price);
        this.maker = maker;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}

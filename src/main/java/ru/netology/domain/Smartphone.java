package ru.netology.domain;

public class Smartphone extends Product {
    private String maker;

    public Smartphone() {
        super();
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

//    @Override
//    public boolean matches(String search) {
//        return super.matches(search) || maker.equals(search);
//    }

    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }
        return maker.equals(search);
    }
}

package com.company;

public class Iphone extends Apple implements Printable {
    private String color;

    public Iphone(String model, int date, String color) {
        super(model, date);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println(getDate()+" "+getModel()+" "+getColor());

    }
}

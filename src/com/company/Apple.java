package com.company;

public  abstract class Apple {
    private String model;
    private int date;

    public Apple(String model, int date) {
        this.model = model;
        this.date = date;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
    public abstract void print();
}

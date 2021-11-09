package com.company;

public class MacBook extends Apple implements Printable {
    private double inch;

    public MacBook(String model, int date, double inch) {
        super(model, date);
        this.inch = inch;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }

    @Override
    public void print() {
        System.out.println(getDate()+ " " +getModel()+" "+getInch());

    }
}

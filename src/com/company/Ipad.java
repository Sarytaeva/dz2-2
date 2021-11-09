package com.company;

public class Ipad extends Apple implements  Printable {
    private boolean camera;

    public Ipad(String model, int date, boolean camera) {
        super(model, date);
        this.camera = camera;
    }

    public boolean isCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }

    @Override
    public void print() {
        System.out.println(getDate()+" "+getModel()+" "+isCamera());
    }

}

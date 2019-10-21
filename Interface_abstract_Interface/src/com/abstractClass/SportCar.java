package com.abstractClass;

public class SportCar extends Car {
    private int maxSpeed;

    @Override
    public void drive() {
        System.out.println( super.getId()+ " "+"is sportcar " +
                super.getModel()+ " , high speed = " + this.maxSpeed);
    }

    public SportCar(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public SportCar(int id, String model, int maxSpeed) {
        super(id, model);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "maxSpeed=" + maxSpeed +
                "} " + super.toString();
    }
}

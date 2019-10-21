package com.interfaces;

public class Sprinter implements Runner {
    private int maxSpeed;

    public Sprinter() {
    }

    public Sprinter(int maxSpeed) {
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
        return "Sprinter{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public void run() {
        System.out.println("i'm sprinter and my max speed = " + this.maxSpeed);
    }

}

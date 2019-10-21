package com.interfaces;

public class Marathoner implements Runner {
    private int maxDistance;

    public Marathoner() {
    }

    public Marathoner(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    @Override
    public String toString() {
        return "Marathoner{" +
                "maxDistance=" + maxDistance +
                '}';
    }

    @Override
    public void run() {
        System.out.println("i'm marathoner and my max distance = " + this.maxDistance);
    }
}

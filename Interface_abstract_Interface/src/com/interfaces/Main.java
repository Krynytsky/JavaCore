package com.interfaces;

public class Main {
    public static void main(String[] args) {
        Sprinter sprinter1 = new Sprinter(25);
        sprinter1.run();
        Marathoner marathoner1 = new Marathoner(42000);
        marathoner1.run();
        Runner runner = new Sprinter(35);
        runner.run();
        Runner runner1 = new Marathoner(8795);
        runner1.run();
    }
}

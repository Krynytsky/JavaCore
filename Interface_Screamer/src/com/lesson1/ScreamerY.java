package com.lesson1;

public class ScreamerY implements Screamer {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @java.lang.Override
    public java.lang.String toString() {
        return "Yuu{" +
                "message='" + message + '\'' +
                '}';
    }

    @java.lang.Override
    public void scream() {
        System.out.println("i am screamer yyyyyyyy");

    }
}

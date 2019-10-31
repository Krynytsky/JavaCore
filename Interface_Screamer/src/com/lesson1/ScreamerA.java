package com.lesson1;

public class ScreamerA implements Screamer  {
    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public java.lang.String toString() {
        return "Aaa{" +
                "message='" + message + '\'' +
                '}';
    }

    @java.lang.Override
    public void scream() {
        System.out.println("i am screamer aaaaaaaa");
    }
}


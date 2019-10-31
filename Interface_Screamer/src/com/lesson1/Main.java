package com.lesson1;

public class Main {
    public static void main( String [] args){
       Screamer screamer = new ScreamerA();
       screamer.scream();
       Screamer screamer1 = new ScreamerY();
       screamer1.scream();
       User user1 = new User();
       System.out.println(user1);

    }
}

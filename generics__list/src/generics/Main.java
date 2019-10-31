package generics;


public class Main {

    public static void main(String[] args) {
        User <Integer, String>  user = new User(1, "vasja");
        User < Integer, Integer > user1 = new User("qweasd1","vasja");
        user1.foo("ffdff");
    }
}

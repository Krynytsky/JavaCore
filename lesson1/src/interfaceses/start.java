package interfaceses;

import com.lesson1.Screamer;
import com.lesson1.ScreamerA;
import com.lesson1.ScreamerY;
import com.lesson1.User;

public class start {
    public static void main( String [] args){
       Screamer screamer = new ScreamerA();
       screamer.scream();
       Screamer screamer1 = new ScreamerY();
       screamer1.scream();
       User user1 = new User();
       System.out.println(user1);

    }
}

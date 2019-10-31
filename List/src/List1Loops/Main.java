package List1Loops;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);//0
        list.add(17);//1
        list.add(13);//2
        list.add(6);//3
        list.add(22);//4
        list.add(31);//5
        list.add(45);//6

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+ " ");
        }

        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0) {
                System.out.println(list.get(i) + " ");
            }
            i++;
        }
    }
}

package Persons;

import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "Vasja", 32));
        persons.add(new Person(2, "Yura", 40));
        persons.add(new Person(3, "Igor", 18));
        persons.add(new Person(4, "Ivan", 24));
        persons.add(new Person(5, "Petro", 56));
        persons.add(new Person(6, "Luda", 19));
        persons.add(new Person(7, "Vika", 23));

        List<Auth> author = new ArrayList<>();
        author.add (new Auth(5,"login5","password5"));
        author.add (new Auth(2,"login2","password2"));
        author.add (new Auth(1,"login1","password1"));
        author.add (new Auth(7,"login7","password7"));
        author.add (new Auth(3,"login3","password3"));
        author.add (new Auth(8,"login8","password8"));
//
      System.out.println(author);
      author.spliter();



    }
    public static void spliter(){
        for (int i = 0; i < persons.size() ; i++) {
            for (int k = 0; k < author.size() ; k++) {
                if(persons.get(i).getId() == author.get(k).getId()){
                    user3s.add( new User3( user1s.get(i).getId(), user1s.get(i).getName(), user1s.get(i).getAge(), user2s.get(k).getLogin(), user2s.get(k).getPassword()));
                }
            }

        }

    }
}

//package Lambdas;
//
//import java.util.Comparator;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.function.Consumer;
//
//public class Main {
//    public static void main(String[] args) {
//        List<User> users1 = new LinkedList<>();
//
//        users1.add(new User(2,"werty"));
//        users1.add(new User(1,"quvi"));
//        users1.add(new User(3,"awerti"));
////
////        for(User users: users1){
////            System.out.println(users);
////        }
////        users1.sort(new Comparator<User>(){
////            @Override
////            public int compare(User o1, User o2) {
////                return o1.getId()-o2.getId();
////            }
////        });
//
//        users1.sort((o1,o2)-> o1.getId()-o2.getId());
//
//        users1.forEach(new Consumer<User>() {
//            @Override
//            public void accept(User user) {
//                System.out.println(user);
//            }
//        });
//
//        System.out.println(users1);
//
//
//    }
//}

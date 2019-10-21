package com.abstractClass;

class Start {
    public static void main(String[] args){
        OffroadCar ofroad1 = new OffroadCar(1, "Nissan", "4x4");
        ofroad1.drive();

        SportCar sportcar1 = new SportCar(1, "Mazda", 330);
        sportcar1.drive();

    }
}

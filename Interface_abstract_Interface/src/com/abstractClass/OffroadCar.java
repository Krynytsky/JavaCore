package com.abstractClass;

public class OffroadCar extends Car {
    private String transmision;

    @Override
    public void drive() {
        System.out.println( super.getId()+ " "+"is offroad car " +
                super.getModel()+" with transmision "+  this.transmision);

    }

    public OffroadCar(String transmision) {
        this.transmision = transmision;
    }

    public OffroadCar(int id, String model, String transmision) {
        super(id, model);
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return "OffroadCar{" +
                "transmision='" + transmision + '\'' +
                "} " + super.toString();
    }
}

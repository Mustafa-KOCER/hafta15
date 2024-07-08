package org.example;

public class Main {
    public static void main(String[] args) {

        Car car = new Car.Builder("Volvo").motor("V4").model(2024).build();
        System.out.println("Oluşturulan araba: "+car.getMarka()+" "+car.getMotor()+" "+car.getModel());

        Singleton test = Singleton.getInstance(3.14f);
        Singleton test2 = Singleton.getInstance(4.42f);
        Singleton.getPi();
    }
}
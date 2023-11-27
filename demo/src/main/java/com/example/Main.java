package com.example;

public class Main {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        Car sportsCar = new SportsCarDecorator(basicCar);
        Car luxurySportsCar = new LuxuryCarDecorator(sportsCar);
        luxurySportsCar.assemble();
    }
}
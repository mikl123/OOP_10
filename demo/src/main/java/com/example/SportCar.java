package com.example;

class SportsCarDecorator extends CarDecorator {
    public SportsCarDecorator(Car car) {
        super(car);
    }

    public void assemble() {
        super.assemble();
        System.out.println("Adding features of a sports car.");
    }
}
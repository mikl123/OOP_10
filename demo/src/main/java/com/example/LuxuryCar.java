package com.example;



class LuxuryCarDecorator extends CarDecorator {
    public LuxuryCarDecorator(Car car) {
        super(car);
    }

    public void assemble() {
        super.assemble();
        System.out.println("Adding features of a luxury car.");
    }
}
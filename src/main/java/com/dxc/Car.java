package com.dxc;

public class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
        //System.out.println("Car Constructor ");//obj is created nd injected
    }

    public void startEngine(){

        engine.start();
    }
}

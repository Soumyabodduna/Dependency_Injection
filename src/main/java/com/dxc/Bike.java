package com.dxc;

public class Bike {
    //String color ;
   // public Bike(String color){
       // this.color=color;
       // System.out.println("Constructor");}
   // public void setColor(String color) {
       // this.color = color;
  //  System.out.println("setter");

  //  }
    Engine engine;

    public Bike(Engine engine) {
        this.engine = engine;
      //  System.out.println("Bike Constructor");//obj is created nd injected
    }

    public void startEngine(){

        engine.start();
    }
}
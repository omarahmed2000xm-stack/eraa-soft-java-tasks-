package com.springtraining;

public class Car {
    Engine engine;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void  init(){

        System.out.println("car is intialized");
    }
    public void drive(){
        System.out.println("the car type is :  "+engine.getType());
    }
    public void destroy (){
        System.out.println("car destroyed ");
    }
}

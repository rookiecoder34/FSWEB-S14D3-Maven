package org.example.arge;

import org.example.company.*;

public class CarSkeleton {
    private String name;
    private Car car;
    private String description;


    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton(){

    }

    public CarSkeleton(String name,String description){
        this.name=name;
        this.description=description;
    }

    public void startEngine(){

    }

    public void drive(){
        runEngine();
    }

    protected void runEngine(){

    }


}

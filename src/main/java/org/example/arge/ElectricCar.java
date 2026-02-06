package org.example.arge;

import org.example.company.Car;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerChange;
    private int batterySize;

    public ElectricCar(String name,String description,double avgKmPerChange, int batterySize){
        super(name,description);
        this.avgKmPerChange = avgKmPerChange;
        this.batterySize = batterySize;

    }




    public double getAvgKmPerChange() {
        return avgKmPerChange;
    }

    public  int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine(){
        System.out.println("Hybrid car engine started");
    }

    @Override
    public void drive(){
        System.out.println("Hybrid");
    }


}

package org.example.arge;

import org.example.company.Car;

public class ElectricCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String name,String description,double avgKmPerCharge, int batterySize){
        super(name,description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;

    }




    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public  int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine(){
        System.out.println("ElectricCar - startEngine");
    }

    @Override
    public void drive(){
        System.out.println("ElectricCar - drive");
        runEngine();
    }


}

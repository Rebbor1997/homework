package com.company.lesson5;

import java.util.Random;

public  class FreightTransport extends LandTransport {
    private Integer capacity;

    public FreightTransport(Integer power, Integer maxSpeed, Integer weight, String brand,
                               Integer wheelAmount, Integer fuelConsumption, Integer capacity) {
        super(power, maxSpeed, weight, brand, wheelAmount, fuelConsumption );
        this.capacity = capacity;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.printf(
                "capacity - %s\n",

                this.capacity);
    }
    public void calculationCargo (Integer cargo){
        if (cargo <= capacity) {
            System.out.println("Грузовик загружен");
        }else {
            System.out.println("Вам нужен грузовик по-больше");
        }
    }
}

package com.company.lesson5;

import java.util.Random;

public class WarTransport extends AirTransport {
    private Integer amountRocket;
    private Boolean isBailoutSystem;
    private final Random random = new Random();
    public WarTransport(Integer power, Integer maxSpeed, Integer weight, String brand,
                        Integer wingspan, Integer minLength, Integer amountRocket,
                        Boolean isBailoutSystem) {
        super(power, maxSpeed, weight, brand, wingspan, minLength );
        this.amountRocket = amountRocket;
        this.isBailoutSystem = isBailoutSystem;
        this.isBailoutSystem = true;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.printf(
                "Amount Rocket - %s\nIs Bailout System - %s\n",
                this.amountRocket, this.isBailoutSystem);
    }
    public void Shot(){
        if (amountRocket > 0) {
            System.out.println("Ракета пошла");
        } else {
            System.out.println("Боеприпассы отсутствуют");
        }
    }
    public void Bailout (){
        if (isBailoutSystem == true) {
            System.out.println("Катапультирование прошло успешно");
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}

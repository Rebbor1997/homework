package com.company.lesson5;

import java.util.Random;

public class CivilTransport extends AirTransport {
    private Integer passengersAmount;
    private Boolean extraClass;

    public CivilTransport(Integer power, Integer maxSpeed, Integer weight, String brand,
                          Integer wingspan, Integer minLength, Integer passengersAmount,
                          Boolean extraClass) {
        super(power, maxSpeed, weight, brand, wingspan, minLength);
        this.passengersAmount = passengersAmount;
        this.extraClass = extraClass;
        this.extraClass = true;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.printf(
                "passengersAmount -%s\nextraClass - %s\n",
                this.passengersAmount, this.extraClass);
    }

    public void calculationPas (Integer calPas) {

        if (calPas <= passengersAmount) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет по-больше");
        }
    }
}

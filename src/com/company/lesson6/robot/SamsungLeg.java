package com.company.lesson6.robot;

public class SamsungLeg implements ILeg {
    private int price;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {}

    @Override
    public void step() {
        System.out.println("Идут ноги Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

package com.company.lesson6.robot;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {}

    @Override
    public void step() {
        System.out.println("Идут ноги Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

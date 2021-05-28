package com.company.lesson6.robot;

public class SonyHand implements IHand {
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {}

    @Override
    public void upHand() {
        System.out.println("Это руки Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

package com.company.lesson6;

public class ZaraFootwear implements Footwear{
    @Override
    public void putOn() {
        System.out.println("Надеваю обувь Zara");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю обувь Zara");
    }
}

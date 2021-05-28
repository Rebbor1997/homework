package com.company.lesson6;

public class ZaraJacket implements Jacket{
    @Override
    public void putOn() {
        System.out.println("Надеваю куртку Zara");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю куртку Zara");
    }
}

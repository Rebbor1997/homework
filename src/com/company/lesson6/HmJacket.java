package com.company.lesson6;

public class HmJacket implements Jacket{
    @Override
    public void putOn() {
        System.out.println("Надеваю куртку Hm");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю куртку Hm");
    }
}

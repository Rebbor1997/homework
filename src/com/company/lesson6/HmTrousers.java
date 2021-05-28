package com.company.lesson6;

public class HmTrousers implements Trousers{
    @Override
    public void putOn() {
        System.out.println("Надеваю штаны Hm");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю штаны Hm");
    }
}

package com.company.lesson6;

public class ZaraTrousers implements Trousers{
    @Override
    public void putOn() {
        System.out.println("Надеваю штаны Zara");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю штаны Zara");
    }
}

package com.company.lesson6;

public class NbTrousers implements Trousers {
    @Override
    public void putOn() {
        System.out.println("Надеваю штаны Nb");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю штаны Nb");
    }
}

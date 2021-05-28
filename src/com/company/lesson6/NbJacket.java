package com.company.lesson6;

public class NbJacket implements Jacket{
    @Override
    public void putOn() {
        System.out.println("Надеваю куртку Nb");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю куртку Nb");
    }
}

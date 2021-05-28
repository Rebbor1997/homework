package com.company.lesson6;

public class NbFootwear implements Footwear{
    @Override
    public void putOn() {
        System.out.println("Надеваю обувь Nb");
    }

    @Override
    public void takeOff() {
        System.out.println("Снимаю обувь Nb");
    }
}

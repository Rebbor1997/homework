package com.company.lesson6.cosmos;

import java.util.Random;

public class Shuttle implements IStart{

    public static void main(String[] args) {

        Shuttle shuttle = new Shuttle();
        Cosmodrome.launch(shuttle);

    }

    @Override
    public boolean prelaunch() {
        Random rand = new Random();
        int x = rand.nextInt(11);
        if (x > 3) {
            System.out.println("Провекра прошла успешна "+x);
            return true;
        } else {
            System.out.println("Проверка прошла неудачно "+x);
            return false;
        }
    }

    @Override
    public void engineStart() {
        System.out.println("Двигатели Шатла\n" +
                "запущены. Все системы в норме");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла");
    }
}

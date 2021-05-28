package com.company.lesson6.cosmos;

public class Cosmodrome {

    public static void launch(IStart Cos) {
        if (Cos.prelaunch() != true) {
            System.out.println("Проверка провалена");
            return;
        }
        Cos.engineStart();
        System.out.println("10 9 8 7 6 5 4 3 2 1 ");
        Cos.start();
    }
}





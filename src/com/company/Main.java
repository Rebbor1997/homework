package com.company;



import com.company.lesson6.robot.*;

public class Main {

    public static void main(String[] args) {
        Robot robot1 = new Robot(new SonyHead(34), new SamsungHand(23), new ToshibaLeg(45));
        int price1 = robot1.getPrice();
        System.out.println(price1);
        Robot robot2 = new Robot(new SamsungHead(90), new SonyHand(98), new ToshibaLeg(87));
        int price2 = robot2.getPrice();
        System.out.println(price2);
        robot2.action();
        Robot robot3 = new Robot(new ToshibaHead(56), new SonyHand(65), new SamsungLeg(43));
        int price3 = robot3.getPrice();
        System.out.println(price3);
        if (price1 > price2 & price1 > price3) {
            System.out.println("Самый дорогой первый робот " + price1);
        }
        if (price2 > price1 & price2 > price3) {
            System.out.println("Самый дорогой второй робот " + price2);
        }
        if (price3 > price1 & price3 > price2) {
            System.out.println("Самый дорогой третий робот " + price3);
        }
    }
}




























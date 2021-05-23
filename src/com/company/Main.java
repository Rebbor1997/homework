package com.company;



import com.company.lesson6.robot.*;

public class Main {

    public static void main(String[] args) {
        Robot robot1 = new Robot(new SonyHead(34), new SamsungHand(23), new ToshibaLeg(45));
        Robot robot2 = new Robot(new SamsungHead(90), new SonyHand(98),  new ToshibaHead(87));
        Robot robot3 = new Robot(new ToshibaHead(56) , new SonyHand(65), new SamsungLeg(43));
    }
}




























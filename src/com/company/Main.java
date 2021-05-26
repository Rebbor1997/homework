package com.company;



import com.company.lesson4.Computer;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer("gyu", "joiji", "876");
        computer.printInfo();
        do {
            computer.turnOn();
        } while (computer.isLimitExceeded());
    }
}


























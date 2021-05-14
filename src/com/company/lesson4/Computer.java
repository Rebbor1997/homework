package com.company.lesson4;

import sun.plugin2.gluegen.runtime.CPU;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private final String processor;
    private final String RAM;
    private final String HDD;
    private final Integer resource;
    private Integer number = 0;
    private boolean isEnabled = false;

    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);

    public Computer(final String processor, final String RAM, final String HDD) {
        this.processor = processor;
        this.RAM = RAM;
        this.HDD = HDD;
        this.resource = random.nextInt(4) + 1;
    }

    public void printInfo() {
        System.out.printf(
                "processor - %s\nRAM - %s\nHDD - %s\nresource - %s\n",
                this.processor, this.RAM, this.HDD, this.resource
        );

        System.out.println("");
    }

    public void turnOn() {
        if (isLimitExceeded()) {
            return;
        }
        System.out.println("Включите компьютер");
        if (random.nextBoolean()) {
            Integer hiddenNumber = random.nextInt();
            System.out.println("Ошибка");
            System.out.println("Введте: 0 или 1");
            Integer inputNumber = scanner.nextInt();
            if (inputNumber.equals(hiddenNumber)) {
                this.isEnabled = true;
            } else {
                System.out.println("Компьютер сгорел");
                this.number = Integer.MAX_VALUE;
            }
        } else {
            System.out.println("Компьютер включен");
            this.isEnabled = true;
        }
        System.out.println();
    }

    public void turnOff() {
        if (isLimitExceeded()) {
            return;
        }
        System.out.println("Включите компьютер");
        if (random.nextBoolean()) {
            Integer hiddenNumber = random.nextInt();
            System.out.println("Ошибка");
            System.out.println("Введте: 0 или 1");
            Integer inputNumber = scanner.nextInt();
            if (inputNumber.equals(hiddenNumber)) {
                this.isEnabled = false;
                this.number++;
            } else {
                System.out.println("Компьютер сгорел");
                this.number = Integer.MAX_VALUE;
            }
        } else {
            System.out.println("Компьютер включен");
            this.isEnabled = false;
            this.number++;
        }
        System.out.println();
    }

    public boolean isLimitExceeded() {
        return this.number > this.resource;
    }
}





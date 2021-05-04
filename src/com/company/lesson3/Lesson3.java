package com.company.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public void task1() {
        int[] mass = new int[21];
        for (int x = 2; x < 21; x++) {
            if (x % 2 == 0) {
                mass[x] = x;
                System.out.print(mass[x] + " ");
            }
        }
        System.out.println();
        for (int x = 2; x < 21; x++) {
            if (x % 2 == 0) {
                mass[x] = x;
                System.out.println(mass[x]);
            }
        }
    }

    public void task2()    {
        int[] mass = new int[100];
        for (int x = 1; x < mass.length; x++) {
            if (x % 2 == 1) {
                mass[x] = x;
                System.out.print(mass[x] + " ");
            }
        }
        System.out.println();
        for (int x = 99; x < mass.length; x--) {
            if (x % 2 == 1) {
                mass[x] = x;
                System.out.print(mass[x] + " ");
            }
        }
    }

    public void task3()    {
        Random rand = new Random();
        int[] mass = new int[15];
        int c = 0;
        for (int x = 0; x < 15; x++) {
            mass[x] = rand.nextInt(100);
            System.out.print(mass[x] + " ");
            if (mass[x] % 2 == 0) {
                ++c;
            }
        }
        System.out.println();
        System.out.println(+c);
    }

    public void task4()    {
        Random rand = new Random();
        int[] mass = new int[20];
        for (int x = 0; x < mass.length; x++) {
            mass[x] = rand.nextInt(21);
            System.out.print(mass[x] + " ");
        }
        System.out.println();
        for (int x = 0; x < mass.length; x++) {
            if (x % 2 == 1) {
                mass[x] = 0;
            }
            System.out.print(mass[x] + " ");
        }
    }

    public void task5()    {
        Random rand = new Random();
        double total1 = 0;
        double total2 = 0;
        double[] mass1 = new double[5];
        double[] mass2 = new double[5];
        for (int x = 0; x < mass1.length; x++) {
            mass1[x] = rand.nextInt(16);
            System.out.print(mass1[x] + " ");
            total1 += mass1[x] / 5;
        }
        System.out.println();
        for (int x = 0; x < mass2.length; x++) {
            mass2[x] = rand.nextInt(16);
            System.out.print(mass2[x] + " ");
            total2 += mass2[x] / 5;
        }
        System.out.println();
        System.out.println(total1);
        System.out.println(total2);
        if (total1 > total2) {
            System.out.println("Среднее арифметическое массива1  больше ");
        }
        if (total1 < total2) {
            System.out.println("Среднее арифметическое массива2 больше ");
        }
        if (total1 == total2) {
            System.out.println("ССредние арифметические  равны ");
        }
    }

    public void task6()    {
        Random rand = new Random();
        int[] mass = new int[4];
        for (int x = 0; x < mass.length; x++) {
            mass[x] = rand.nextInt(10);
            System.out.print(mass[x] + " ");
        }
        System.out.println();
        for (int x = 0; x < mass.length; x++) {
            if (x > 1) {
                if (mass[x - 1] >= mass[x]) {
                    System.out.println("не является");
                    break;
                }
            }
            if (x == mass.length - 1) {
                System.out.println("является");
            }
        }
    }

    public void task7()    {
        Random rand = new Random();
        int[] mass = new int[12];
        int max = mass[0];
        int jmax = 0;
        for (int x = 1; x < mass.length; x++) {
            mass[x] = rand.nextInt(16);
            System.out.print(mass[x] + " ");
            if (mass[x] > max) {
                max = mass[x];
                jmax = x;
            }
        }
        System.out.println();
        System.out.println("максимальное знаечние " + max);
        System.out.println("Индекс последнего вхождения " + jmax);
    }

    public void task8()    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите положительное число");
        int n = scan.nextInt();
        int[] mass = new int[n];
        int r = 0;
        int sumhalf1 = 0;
        int sumhalf2 = 0;
        for (int x = 0; x < mass.length; x++) {
            mass[x] = rand.nextInt(16);
            System.out.print(mass[x] + " ");
        }
        System.out.println();
        r = mass.length / 2;
        if (n % 2 == 1) {
            for (int x = 0; x < r; x++) {
                sumhalf1 += mass[x];
            }
            for (int x = r + 1; x < n; x++) {
                sumhalf2 += mass[x];
            }
        }
        if (n % 2 == 0) {
            for (int x = 0; x < r; x++) {
                sumhalf1 += mass[x];
            }
            for (int x = r; x < n; x++) {
                sumhalf2 += mass[x];
            }
        }
        if (sumhalf1 > sumhalf2) {
            System.out.println("Первая половина больше " + sumhalf1);
        }
        if (sumhalf1 < sumhalf2)
            System.out.println("Вторая половина больше " + sumhalf2);
        if (sumhalf1 == sumhalf2) {
            System.out.println("Суммы равны");
        }
    }

    public void task9()    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Введите число больше 3");
        int n = scan.nextInt();
        int c = 0;
        if (n < 3) {
            System.out.println("Число введеное вами меньше 3");
        } else {
            int[] mass = new int[n];
            for (int x = 0; x < mass.length; x++) {
                mass[x] = rand.nextInt(n);
                System.out.print(mass[x] + " ");
                if (mass[x] % 2 == 0 & mass[x] != 0) c++;
                {
                }
            }
            System.out.println();
            int[] mass2 = new int[c];
            for (int x = 0, b = 0; x < mass.length; x++) {
                if (mass[x] % 2 == 0 & mass[x] != 0) {
                    mass2[b] = mass[x];
                    System.out.print(mass2[b] + " ");
                }
            }
        }
    }

    public void task10() {
        System.out.println("Введите размерность массива N и M");
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int n = 0, m = 0;
        if (scan.hasNextInt()) {
            n = scan.nextInt();
            m = scan.nextInt();
        }
        int[][] mass = new int[n][m];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mass[i][j] = rand.nextInt(51);
                System.out.print(mass[i][j] + " ");
                int element = mass[i][j];
                if (i == j & element % 2 == 0) {
                        sum += element;
                    }
                }
            System.out.println();
            }
        System.out.println(sum);
    }



    public void task11() {
        System.out.println("Введите размерность массива N и M");
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int n = 0, m = 0;
        if (scan.hasNextInt()) {
            n = scan.nextInt();
            m = scan.nextInt();
        }
        int[][] mass = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mass[i][j] = rand.nextInt(51);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 1; i < mass.length; i++) {
            for (int j = 0; j <= i && j < mass[i].length; j++) {
                    int element = mass[i][j];
                    if (element % 2 == 1) {
                        System.out.print(" "+element);
                    }
            }
        }
    }
    public void task12() {
        System.out.println("Введите размерность массива N и M");
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int n = 0, m = 0;
        if (scan.hasNextInt()) {
            n = scan.nextInt();
            m = scan.nextInt();
        }
        int[][] mass = new int[n][m];
        int element1 = 1;
        int element2 = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mass[i][j] = rand.nextInt(51);
                System.out.print(mass[i][j] + " ");
                if (i == j) {
                    element1 *= mass[i][j];
                }
            }
            System.out.println();
        }
        for(int i = mass.length - 1; i >= 0; i--) {
            element2 *= mass[i][mass.length - 1 - i];
        }
        if (element1 > element2) {
            System.out.println("Произведение главной диагонали больше "  +element1 );
        }
        if (element1 < element2) {
            System.out.println("Произведение побочной диагонали больше "  +element2 );
        }
        if (element1 == element2) {
            System.out.println("Произведение диагоналей равны"  );
        }
    }

    public void task13() {
        System.out.println("Введите размерность массива N и M");
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int n = 0, m = 0;
        if (scan.hasNextInt()) {
            n = scan.nextInt();
            m = scan.nextInt();
        }
        int[][] mass = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mass[i][j] = rand.nextInt(51);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < mass.length - 1; i++) {
            for (int j = 0; j < mass.length - i - 1; j++) {
                int element = mass[i][j];
                if (element % 2 == 0) {
                    sum += element;
                }
            }
        }
        System.out.println(sum);
    }


    public void task14() {
        System.out.println("Введите размерность массива N и M");
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int n = 0, m = 0;
        if (scan.hasNextInt()) {
            n = scan.nextInt();
            m = scan.nextInt();
        }
        int[][] mass = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mass[i][j] = rand.nextInt(51);
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                int temp = mass[i][j];
                mass[i][j] = mass[j][i];
                mass[j][i] = temp;
                System.out.print(temp );
            }
            System.out.println();
        }
    }
}












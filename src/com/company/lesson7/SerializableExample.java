package com.company.lesson7;
import java.io.*;

public class SerializableExample {
        public static void main(String[] args) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car.txt"));
                 ObjectInputStream ois = new ObjectInputStream(new FileInputStream("car.txt"))) {
                Car p = new Car("BMW", 150, 30000);
                oos.writeObject(p);

                Car outCar = (Car) ois.readObject();


                System.out.println(outCar.getBrand());
                System.out.println(outCar.getSpeed());
                System.out.println(outCar.getPrice());
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    class Car implements Serializable {
        private String brand;
        private int speed;
        private int price;

        public  Car (String brand, int speed, int price) {
            this.brand = brand;
            this.speed = speed;
            this.price = price;
        }

        public String getBrand(){
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public int getSpeed() {
            return speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

}

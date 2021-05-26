package com.company.lesson5;

public class Transport  {
    protected Integer power;
    protected Integer maxSpeed;
    protected Integer weight;
    protected String brand;

    public Transport(Integer power, Integer maxSpeed, Integer weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }
    public void Info() {
        System.out.printf(
                "Power KW - %s\n" +
                        "maxSpeed - %s\n" +
                        "Weight - %s\n" +
                        "Brand - %s\n",
                this.getPowerKW(), this.maxSpeed, this.weight, this.brand
        );
    }
    public Double getPowerKW() {
        return power * 0.74;
    }
}

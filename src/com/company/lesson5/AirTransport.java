package com.company.lesson5;

public class AirTransport extends Transport {
    protected Integer wingspan;
    protected Integer minLength;

    public AirTransport(Integer power, Integer maxSpeed, Integer weight, String brand,
                        Integer wingspan,Integer minLength) {
        super(power, maxSpeed, weight, brand);
        this.wingspan = wingspan;
        this.minLength = minLength;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.printf(
                "wingspan - %s\nminLength - %s\n" ,
         this.wingspan, this.minLength);
    }
}


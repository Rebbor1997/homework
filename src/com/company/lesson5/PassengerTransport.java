package com.company.lesson5;

public  class PassengerTransport extends LandTransport {
    private Integer bodyType;
    private Integer passengersAmount;

    public PassengerTransport(Integer power, Integer maxSpeed, Integer weight, String brand,
                              Integer wheelAmount, Integer fuelConsumption, Integer bodyType,
                              Integer passengersAmount) {
        super(power, maxSpeed, weight, brand, wheelAmount, fuelConsumption);
        this.bodyType = bodyType;
        this.passengersAmount = passengersAmount;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.printf(
                "bodyType - %s\npassengersAmount - %s\n",
                this.bodyType, this.passengersAmount);
    }

    public void calculateRoute(Integer time) {
        String result = "За время %s ч, автомобиль %s двигаясь с максимальной " +
                "скоростью %s км/ч проедет %s км и израсходует %s " +
                "литров топлива.";
        Integer distance = this.maxSpeed * time;
        System.out.printf(result, time, this.brand, this.maxSpeed, distance, fuelСalculation(distance.doubleValue()));
    }

    public Double fuelСalculation(Double distance) {
        return distance / 100;
    }
}

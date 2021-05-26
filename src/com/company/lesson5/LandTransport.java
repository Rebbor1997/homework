package com.company.lesson5;

public   class LandTransport extends Transport {
    protected Integer wheelAmount;
    protected Integer fuelConsumption;

    public   LandTransport(Integer power, Integer maxSpeed, Integer weight, String brand,
                           Integer wheelAmount,Integer fuelConsumption ) {
        super(power, maxSpeed, weight, brand);
        this.wheelAmount = wheelAmount;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public void Info() {
        super.Info();
        System.out.printf(
                "wheelAmount - %s\nfuelConsumption - %s\n",
                this.wheelAmount, this.fuelConsumption);
    }
}

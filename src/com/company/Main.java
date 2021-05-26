package com.company;



import com.company.lesson4.Computer;
import com.company.lesson5.*;

import javax.sound.sampled.Line;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Transport transport = new Transport(12, 13, 18, "audi");
        transport.Info();
        transport.getPowerKW();

        AirTransport airTransport = new AirTransport(23, 45, 56, "bmw",
                56, 76);
        airTransport.Info();

        LandTransport landTransport = new LandTransport(24, 32, 12, "mers",
                65, 54);
        landTransport.Info();

        PassengerTransport passengerTransport = new PassengerTransport(65, 87, 90, "dgd",
                34, 45, 90, 60);
        passengerTransport.Info();
        passengerTransport.calculateRoute(2);
        passengerTransport.fuelСalculation(50.0);

        FreightTransport freightTransport = new FreightTransport(56, 43, 33, "ghj",
                55, 88, 22);
        freightTransport.Info();
        freightTransport.calculationCargo(72);

        CivilTransport civilTransport = new CivilTransport (23, 34, 45, "dfd",
                23, 12, 45, true);
        civilTransport.Info();
        civilTransport.calculationPas(8);

        WarTransport warTransport = new WarTransport(11, 22, 33, "joi", 33,
                33, 0, true);
        warTransport.Info();
        warTransport.Shot();
        warTransport.Bailout();
    }
}




























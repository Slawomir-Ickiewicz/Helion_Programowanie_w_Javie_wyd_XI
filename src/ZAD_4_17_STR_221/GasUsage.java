package ZAD_4_17_STR_221;

import java.util.Scanner;

public class GasUsage {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int starter = 0;

        TripMain trip1 = new TripMain();

        while (starter != -1) {
            System.out.println("Enter kilometers number");
            int trip= input.nextInt();

            System.out.println("Enter fuel refueled");
            int gas = input.nextInt();
            System.out.println("Fuel per 100 km is: " + trip1.fuelPer100(gas, trip));
            System.out.println("Enter -1 if you want to finish or any other key if you want to continue");
            starter = input.nextInt();
        }


        System.out.println("Total fuel for all trips: " + trip1.returnTotalGas());
        System.out.println("Total kilometers for all trips: " + trip1.returnTotalTrip());
        System.out.println("Total fuel per 100 km is: " + trip1.getTotalFuelPer100());


    }


}


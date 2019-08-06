package Chapter06.EX_6_8_PG_320;

import java.util.Scanner;

public class ParkingFee {

    public double calculateCharges(int hours) {

        double summary = 0;

        if (hours > 3 && hours < 24) {
            summary = 2 + (Math.ceil(hours - 3) * 0.5);


        } else if (hours == 24) {
            summary = 10;
        } else if (hours <= 3) {
            summary = 2;
        }

        return summary;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You are first client! Please enter how many hours car was parked or enter -1 to exit ");
        int hours = input.nextInt();

        double total = 0;
        while (hours != -1) {
            ParkingFee client = new ParkingFee();
            System.out.println("This client need to pay: " + client.calculateCharges(hours) + " USD");
            total = total + client.calculateCharges(hours);

            System.out.println("Please enter how many hours car was parked or enter -1 to exit ");
            hours = input.nextInt();

        }

        System.out.println("Total amount of parking fees: " + total);
    }
}

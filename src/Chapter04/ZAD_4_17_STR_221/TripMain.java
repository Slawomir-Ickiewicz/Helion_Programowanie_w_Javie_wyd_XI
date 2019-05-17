package Chapter04.ZAD_4_17_STR_221;

public class TripMain {

    double totalGas;
    double totalTrip;


    public int fuelPer100(int gas, int trip) {
        totalGas +=gas;
        totalTrip +=trip;
        return trip / gas;

    }

    public double returnTotalGas() {
        return totalGas;
    }

    public double returnTotalTrip(
    ) {
        return totalTrip;
    }

    public double getTotalFuelPer100() {
        return totalTrip / totalGas;
    }


}

package Chapter06.EX_6_32_PG323;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PointsDistance {

    public static double distance(double x1, double x2, double y1, double y2) {
        double distance = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return distance;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter first set of coordinates separated by enter ");
        double x1 = Double.parseDouble(reader.readLine());
        double x2 = Double.parseDouble(reader.readLine());
        System.out.println("Please enter second set of coordinates separated by enter ");
        double y1 = Double.parseDouble(reader.readLine());
        double y2 = Double.parseDouble(reader.readLine());


        System.out.println("Distance between points " +"("+x1+","+x2+")"+" and"+"("+y1+","+y2+")" + " equals " +distance(x1,x2,y1,y2));
    }
}


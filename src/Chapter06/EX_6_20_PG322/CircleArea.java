package Chapter06.EX_6_20_PG322;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CircleArea {

    public static double circleArea(double radius){
        double area = Math.PI*Math.pow(radius,2);
        return area;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius to calculate circle area: ");
        double radius  = input.nextDouble();

        DecimalFormat df = new DecimalFormat("####0.00"); //additional class  - just googled and used to display 2 digits after dot.

        System.out.println("Area of circle with radius "+radius+" is "+df.format(circleArea(radius)));

    }
}

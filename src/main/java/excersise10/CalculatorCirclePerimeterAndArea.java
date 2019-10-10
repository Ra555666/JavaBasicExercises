package excersise10;

import java.util.Scanner;

public class CalculatorCirclePerimeterAndArea {

    public double circlePerimeter(float radius) {
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public double circleArea(float radius) {
        double area = Math.PI * Math.pow(radius,2);
        return area;
    }

        public static void main(String[] args) {
            CalculatorCirclePerimeterAndArea circlePerimeterAndArea = new CalculatorCirclePerimeterAndArea();
            Scanner in = new Scanner(System.in);
            System.out.println("Input radius");
            float radius = in.nextFloat();
            System.out.println("Perimeter is = "+ circlePerimeterAndArea.circlePerimeter(radius));
            System.out.println("Area is = " + circlePerimeterAndArea.circleArea(radius));
        }
    }


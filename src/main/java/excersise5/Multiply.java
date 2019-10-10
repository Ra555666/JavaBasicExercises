package excersise5;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        float firstNumber = input.nextFloat();
        System.out.print("Input second number: ");
        float secondNumber = input.nextFloat();
        float divideResult = firstNumber * secondNumber;
        System.out.println(firstNumber + " x " + secondNumber + " = " + (int)divideResult);
    }
}

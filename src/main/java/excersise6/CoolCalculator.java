package excersise6;

import java.util.Scanner;

public class CoolCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        float firstNumber = input.nextFloat();
        System.out.print("Input second number: ");
        float secondNumber = input.nextFloat();
        float sumNumbers = firstNumber + secondNumber;
        float subtractNumbers = firstNumber - secondNumber;
        float multiplyNumbers = firstNumber * secondNumber;
        float divideNumbers = firstNumber / secondNumber;
        float moduleNumbers = firstNumber % secondNumber;
        System.out.println((int)firstNumber + " + " + (int)secondNumber + " = " + (int)sumNumbers);
        System.out.println((int)firstNumber + " - " + (int)secondNumber + " = " + (int)subtractNumbers);
        System.out.println((int)firstNumber + " x " + (int)secondNumber + " = " + (int)multiplyNumbers);
        System.out.println((int)firstNumber + " / " + (int)secondNumber + " = " + divideNumbers);
        System.out.println((int)firstNumber + " mod " + (int)secondNumber + " = " + (int)moduleNumbers);
    }
}

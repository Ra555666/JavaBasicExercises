package excersise3;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number");
        float firstNumber = input.nextInt();
        System.out.println("Input second number");
        float secondNumber = input.nextInt();
        float divideResult = firstNumber / secondNumber;
        System.out.println(firstNumber + " / " + secondNumber + " = " + divideResult );
    }
}

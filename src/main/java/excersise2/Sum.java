package excersise2;

import java.util.Scanner;

public class Sum {
    private int firstNumber;
    private int secondNumber;

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public int summingTwoNumbers(){
        return (this.firstNumber + this.secondNumber);
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        Scanner input = new Scanner(System.in);
        System.out.println("Input first number");
        sum.setFirstNumber(input.nextInt());
        System.out.println("Input second number");
        sum.setSecondNumber(input.nextInt());
        System.out.println("Sum of two your number is " + sum.summingTwoNumbers());
    }
}

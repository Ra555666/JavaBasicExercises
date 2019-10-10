package excersise7;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number");
        int number = input.nextInt();
        for (int i = 1; i <= 10; i++){
            int multiplyResult = number * i;
            System.out.println(number + " x " + i + " = " + multiplyResult );
        }

    }
}

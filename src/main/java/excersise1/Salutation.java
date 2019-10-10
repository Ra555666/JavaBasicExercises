package excersise1;

import java.util.Scanner;

public class Salutation {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void greetingToTheUser(){
        System.out.println("Hello!");
        System.out.println(name);
    }

    public static void main(String[] args) {
        Salutation test = new Salutation();
        Scanner input = new Scanner(System.in);
        System.out.println("Input your name");
        String nameUser = input.nextLine();
        test.setName(nameUser);
        test.greetingToTheUser();
    }
}

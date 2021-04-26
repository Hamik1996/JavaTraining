package firstlesson;

import java.util.Scanner;

public class HomeWork2Ex1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("please enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("please enter the second number: ");
        double num2 = input.nextDouble();

        System.out.print("Please enter operation: ");
        String operation = input.next();

        if (operation.equalsIgnoreCase("+")) {
            System.out.print("your answer is: " + (num1 + num2));
        }
        if (operation.equalsIgnoreCase("-")) {

            System.out.print("your answer is: " + (num1 - num2));
        }

        if (operation.equalsIgnoreCase("/")) {

            System.out.print("your answer is: " + (num1 / num2));
        }
        if (operation.equalsIgnoreCase("*")) {

            System.out.print("your answer is: " + (num1 * num2));
        }


    }
}

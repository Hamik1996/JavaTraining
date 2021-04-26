package firstlesson;

import java.util.Scanner;

public class HomeWork2Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter first the number: ");
        double num1 = input.nextDouble();

        System.out.print("please enter second the number: ");
        double num2 = input.nextDouble();

        System.out.print("please enter third the number: ");
        double num3 = input.nextDouble();

        if (num1 > num2 && num1 > num3) {
            System.out.print("The greatest is: " + num1);
        }
        if (num2 > num1 && num2 > num3) {
            System.out.print("The greatest is: " + num2);
        }
        if (num3 > num2 && num3 > num1) {
            System.out.print("The greatest is: " + num3);
        }
    }
}

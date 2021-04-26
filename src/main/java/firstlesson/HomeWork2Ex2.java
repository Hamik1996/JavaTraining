package firstlesson;

import java.util.Scanner;

public class HomeWork2Ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please enter the number: ");
        double num1 = input.nextDouble();

        if (num1 % 2 == 0) {
            System.out.print("The number is Even: ");
        }
        else {
            System.out.println("The number isn't Even");
        }
    }
}

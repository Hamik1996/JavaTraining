package firstlesson;

import java.util.Scanner;

public class HomeWork2Ex4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = input.nextInt();

        if (number > 0) {
            System.out.println("Number is positive");
        }
        else if (number < 0) {
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is zero");
        }
    }
}

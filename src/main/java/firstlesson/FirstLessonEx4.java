package firstlesson;


import java.util.Scanner;

public class FirstLessonEx4 {
    public static void main (String[] args){

        Scanner input = new Scanner (System.in);
        System.out.print("Input the first number: ");
        int a = input.nextInt();
        System.out.print("Input the second number: ");
        int b = input.nextInt();
        int c = a*b;
        System.out.println("The bazmapatik of a and b: " +c);


    }
}

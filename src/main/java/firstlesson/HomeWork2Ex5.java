package firstlesson;

import java.util.Scanner;

public class HomeWork2Ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number: ");
        int day = input.nextInt();

        switch(day)
        {
            case 1:
                System.out.println("Monday");break;
            case 2:
                System.out.println("Tuesday");break;
            case 3:
                System.out.println("Wednesday");break;
            case 4:
                System.out.println("Thursday");break;
            case 5:
                System.out.println("Friday");break;
            case 6:
                System.out.println("Saturday");break;
            case 7:
                System.out.println("Sunday");break;
            default:
                System.out.println("Invalid day rang");break;
        }
    }
}

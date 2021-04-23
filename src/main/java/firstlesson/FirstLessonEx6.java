package firstlesson;

import java.util.Scanner;

public class FirstLessonEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Type a double-type number:");
            try {
              double number = Double.parseDouble(input.next());
                break;
            } catch (NumberFormatException ignore) {
                System.out.print("Invalid input");
              }
        }
    }
}

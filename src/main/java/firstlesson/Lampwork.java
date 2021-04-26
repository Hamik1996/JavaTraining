package firstlesson;

import java.util.Scanner;

public class Lampwork {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Lamp pluged in ?: ");
        String text1 = input.next();
        if (text1.equalsIgnoreCase("no")){
            System.out.println("plug in lump");
        }
        if(text1.equalsIgnoreCase("yes")){
            System.out.print("Bulb burned out ? ");
            String text2 = input.next();
            if (text2.equalsIgnoreCase("yes")){
                System.out.println("Replace bulb");
            }
            else {
                System.out.println("Repair lamp");
            }
        }

    }

}

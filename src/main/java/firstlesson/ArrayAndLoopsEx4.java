package firstlesson;

public class ArrayAndLoopsEx4 {
    public static void main(String[] args) {
        int[] numbers = { 3,6,45,32 };
        int count = numbers[0];
        for (int i = 1; i < numbers.length; i++){
            for (int  = 1; i < numbers.length; i++)
            if (count > numbers[i]) {
                count = numbers[i];
            }
        }

    }
}

package firstlesson;

public class ArraysAndLoopsEx1 {
    public static void main(String[] args) {
        int[] numbers = {10, 48, 6, -43, 65, 34, 22};
        int i;
        int sum = 0;
        for(i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];

        double average = sum / numbers.length;
        System.out.println("Average of the array elements is : " + average);
    }
}

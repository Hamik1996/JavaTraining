package firstlesson;

 public class ArrayAndLoopsEx2 {
    public static void main(String[] args) {
        String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };
        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343,
                317, 265 };
        int count = times[0];
        int i;
        int j = 0;
        for (i = 1; i < times.length; i++){
            if (count > times[i]) {
                count = times[i];
                j = i;
            }
        }


        String name = names[j];
        System.out.println(" name: " + name + "\nThe time: " + count);
    }
}



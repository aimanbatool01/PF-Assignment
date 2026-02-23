public class lab4 {
    public static void main(String[] args) {

        int[] scores = {90, 50, 70,50, 40};

        int sum = 0;

        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }

        double average = (double) sum / scores.length;

        System.out.println("Total Marks: " + sum);
        System.out.println("Average Marks: " + average);
    }
}

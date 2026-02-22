public class all_labs {
    public static void main(String[] args) {

        int[] arr = {100, 150, 200, 250, 300};   
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum = " + sum);
    }
}
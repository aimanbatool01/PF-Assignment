public class lab5 {
    public static void main(String[]args){
        
        int[] arr = {34,71,12,98,45,23};

        int largest = arr[0]; 

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest number = " + largest);
    }
}



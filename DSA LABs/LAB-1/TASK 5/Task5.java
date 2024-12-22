import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
                 int n = scanner.nextInt();

              int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
              for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();  }

          int start = 0;
          int end = arr.length-1;

           while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;  }

        System.out.println("Reversed array:");
            for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
    } }
}

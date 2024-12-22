import java.util.Arrays;

public class Task4_E3 {
    public static void main(String args[]) {
        
        int[] arr = {11, 22, 33, 44, 55};
        int target = 33;
        
        Arrays.sort(arr);
        
        int left = 0;
        int right = arr.length -1;
        int middle;
        boolean found = false;
        
        while(left <= right){
        
            middle = left + (right - left)/2;
            
            if (arr[middle] == target){
                System.out.println("found at index: "+ middle);
                found = true;
                break;  }
            
            if (arr[middle] < target){
                
                left = middle+1;
            }
            else{
                right = middle-1;
            }
        
        }
        
        if (found == false){
            
            System.out.println("Element not found in Array");
    }
    }
}

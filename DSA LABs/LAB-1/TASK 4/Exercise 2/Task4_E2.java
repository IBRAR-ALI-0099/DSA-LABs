public class Task4_E2 {
    public static void main(String args[]) {
        
        int arr[] = {4, 6, 2, 8, 10};
        int find = 8;
        
        for (int i = 0; i < arr.length; i++){
            if(arr[i] == find){
                System.out.println("Found at index: "+i);
                return;
            }
            
        }
                System.out.println("Not found");

        }
    }


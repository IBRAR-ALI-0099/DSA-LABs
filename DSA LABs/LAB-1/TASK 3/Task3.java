public class Task3 {
    public static void main(String args[]) {

        int arr[] = {8, 16, 24, 32, 40};
        int deleteIndex = 2;
        
        for(int i = deleteIndex; i < arr.length-1; i++){
            arr[i] = arr[i+1];
        }
        
        arr[arr.length-1] = 0;
        
        for(int i = 0; i < arr.length; i++){
            System.out.println("After deleted value: " + arr[i]);
    }
}
}
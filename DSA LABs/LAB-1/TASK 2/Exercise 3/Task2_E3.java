public class Task2_E3 {
    public static void main(String[] args) {

        int[] arr = {3, 6, 9, 12, 15};
        int valueToInsert = 18;

        arr[arr.length - 1] = valueToInsert;

        for(int i = 0; i < arr.length; i++){
            
            System.out.println("Array after insertion: " + arr[i]);
        }
    }
}

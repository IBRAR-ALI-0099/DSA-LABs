import java.util.Arrays;

public class Task2_E2 {
    public static void main(String args[]){
        int[] arr = {100, 200, 300, 400, 500};

        int valueToInsert = 250;
        int index = 2;
        int[] newArr = new int[arr.length + 1];

        for(int i = 0; i < index; i++){
            newArr[i] = arr[i];
        }

        newArr[index] = valueToInsert;

        for (int i = index + 1; i < newArr.length; i++){
            newArr[i] = arr[i - 1];
        }

        System.out.println("Array after insertion: " + Arrays.toString(newArr));
    }
}
    
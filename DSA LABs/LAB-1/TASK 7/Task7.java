import java.util.Scanner;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        if(str1.length() != str2.length()){
            System.out.println("Not Anagram");
              return; }

        char[] array1 = str1.toCharArray();
         char[] array2 = str2.toCharArray();
        
          Arrays.sort(array1);
           Arrays.sort(array2);

         if(Arrays.equals(array1, array2)){
            System.out.println("Anagram");
        } 
        else { System.out.println("Not Anagram"); }
}
}

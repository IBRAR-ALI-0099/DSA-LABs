import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word: ");
          String str = scanner.nextLine();
        
        char[] charArray = str.toCharArray();
        
        int start = 0;
        int end = charArray.length-1;
        boolean isPalindrome = true;

           while (start < end){
            if(charArray[start] != charArray[end]){
                isPalindrome = false;
                break; }
            start++;
            end--;  }

           
        if(isPalindrome){
            System.out.println("it's Palindrome");
        }
        else
        { 
            System.out.println("Not Palindrome"); }
}
}

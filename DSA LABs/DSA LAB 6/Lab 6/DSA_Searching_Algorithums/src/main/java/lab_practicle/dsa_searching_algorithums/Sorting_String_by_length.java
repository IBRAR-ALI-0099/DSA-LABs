/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package lab_practicle.dsa_searching_algorithums;

/**
 *
 * @author Ibrar Ali
 * 
 *  TASK 3
 */
public class Sorting_String_by_length {
    
    public void StringBubbleSort(String[] arr){
            for(int i=0; i<arr.length-1; i++){
                for(int j=0; j<arr.length-1; j++){
                    if((arr[j].length()) > (arr[j+1].length())){
                        String temp= arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1] = temp;
                     
                    }
                }
            }
            System.out.print("Sorted Array: ");
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }
    
    public static void main(String args[]) {
        
        Sorting_String_by_length obj = new Sorting_String_by_length();
        String[] array = {"apple", "pie", "banana", "cat"};
        obj.StringBubbleSort(array);
    }
}

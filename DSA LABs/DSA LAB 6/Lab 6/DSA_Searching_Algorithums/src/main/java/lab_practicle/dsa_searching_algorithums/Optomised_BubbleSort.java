/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package lab_practicle.dsa_searching_algorithums;

/**
 *
 * @author Ibrar Ali
 * 
 *  TASK 2
 */
public class Optomised_BubbleSort {

   public void opti_BubbleSort(int[] arr){
            
       for(int i=0; i<arr.length-1; i++){
           boolean swap = false;
                for(int j=0; j<arr.length-1-i; j++){
                    if(arr[j] > arr[j+1]){
                        int temp= arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1] = temp;
                        swap = true;
                     
                    }
                }
                if(!swap){
                    break;
                }
            }
            System.out.print("Sorted Array: ");
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i] + " ");
            }
        }
    
    public static void main(String args[]) {
               Optomised_BubbleSort obj = new Optomised_BubbleSort();
        
        int[] array = {5,1,3,4,6,7};
        obj.opti_BubbleSort(array);
    }
}

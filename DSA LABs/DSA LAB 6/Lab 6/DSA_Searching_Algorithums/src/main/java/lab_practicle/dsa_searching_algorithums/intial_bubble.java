/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package lab_practicle.dsa_searching_algorithums;

/**
 *
 * @author Ibrar Ali
 * 
 *  TASK 1
 */
public class intial_bubble {

     public void bubbleSort(int[] arr){
            for(int i=0; i<arr.length-1; i++){
                for(int j=0; j<arr.length-1; j++){
                    if(arr[j] > arr[j+1]){
                        int temp= arr[j];
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
        // TODO code application logic here
        
           intial_bubble obj = new intial_bubble();
        
        int[] array = {5,1,3,4,6,2};
        obj.bubbleSort(array);
    }
}

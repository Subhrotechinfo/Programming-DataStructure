/*
 *  Copyright Subhro Chatterjee
 */

package sorting;

import java.util.Arrays;

/**
 * @author subhro
 */

public class BubbleSort {
    static int count = 0; 
    static int[] arr = new int[]{64, 34, 25, 12, 22, 11, 90};  
    public static void bubbleSort(int arr[]){
        
        int length = arr.length;
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-i-1;j++){
                
                if( arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
//        for(int index=0;index<length;index++)
//            System.out.print(arr[index]+" ");
//        
    }
    
    //Recursive bubbleSort
    public static void recursiveBubble(int[] arr,int size){
        int count=0;
        if(size == 1)
            return;
        for(int index = 0 ; index < size-1 ; index++ ){
            
            if(arr[index] > arr[index+1] ){
                int temp = arr[index];
                arr[index] = arr[index+1];
                arr[index+1] = temp;++count;
            }
        }
        recursiveBubble(arr,size-1);
        
    }
    
    public static void main(String args[]){
        //bubbleSort(arr);
        //System.out.println("Naive method :"+Arrays.toString(arr));
        recursiveBubble(arr,arr.length);
        //System.out.println("Recursive Method"+Arrays.toString(arr));
        System.out.println("Array is sorted in "+count+"swaps.");
        System.out.println("First Element :"+arr[0]);
        System.out.println("Last Element :"+arr[arr.length-1]);
    }
}
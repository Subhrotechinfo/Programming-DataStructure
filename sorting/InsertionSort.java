/*
 *  Copyright Subhro Chatterjee
 */

package sorting;

import java.util.Arrays;

/**
 * @author subhro
 */

public class InsertionSort {

    static int[] arr = new int[]{9,6,5,0,8,2,7};
    
    public static void main(String args[]){
        
        insertionSort(arr,arr.length);
    }
    
    public static void insertionSort(int[]arr , int size){
        
        int i,j,key;
        for(j = 1 ;  j < size ; j++){
            key = arr[j];
            i = j-1;
            
            while(i >= 0 && key < arr[i] ){
                
                arr[i+1] = arr[i];
                i = i-1;
            }
            arr[i+1] = key;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    public static void recursiveInsertion(int arr[] , int size){
        
        //Base Case when there is only 1 element
        if(size <= 1)
            return ;
        
        //Sort first n-1 elements(Recursive call to the function for sorting inner elements)
        
        recursiveInsertion(arr,size-1);
        
        //Insert the last element at its correct position.
        int last = arr[size-1];
        int j = size-2;
        
        //Iterating over each element in the sorted subarray to insert current element
        while(j >= 0 && arr[j] > last ){
            //Shifting the elements from their position by 1 to insert the current
            //element at appropriate position
            arr[j+1]=arr[j];
            j--;
        }
        //inserting the current element at its appropriate position
        arr[j+1] = last;
    }
}
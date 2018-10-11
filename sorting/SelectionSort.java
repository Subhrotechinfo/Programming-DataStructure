/*
 *  Copyright Subhro Chatterjee
 */

package sorting;

import java.util.Arrays;

/**
 * @author subhr
 */

public class SelectionSort {
    
    static int[] arr= new int[]{3, 1, 5, 2, 7, 0}; 
    
    public static void selectionSort(int[] arr){
        
        int minIndex ;
        
        for(int i=0;i<arr.length;i++){
            
            minIndex=i;                     //Counter increase            
            
            for(int j=i+1;j<arr.length;j++){
                
                if(arr[j] < arr[minIndex]){
                    
                    minIndex=j;             //Copy Min index
                
                }
            }
                                            
            int temp = arr[minIndex];       //swapping
            arr[minIndex]=arr[i];
            arr[i]=temp;
        }
        System.out.println(Arrays.toString(arr));
        
    }
    
    public static int minIndex(int[]arr , int i,int j){
        if(i == j)
            return i;
        
        //Finding min index of remaining element
        int k = minIndex(arr,i+1,j);
        
        //Return minimum of current and remaining
        return ( arr[i] < arr[k] ? i : k );
                
    }
    
    
    
    public static void recursiveSelection(int []arr,int n,int index){
        
        //Return when starting and size are same
        if(index == n)
            return;
        
        //calling minimum index for min index
        int k = minIndex(arr,index,n-1);
        
        //Swapping when K and minIndex are not same
        if(k != index){
            int temp = arr[k];
            arr[k] = arr[index];
            arr[index]=temp;
        }
        recursiveSelection(arr,n,index+1);
    }
    
    public static void main(String args[]){
        //int[] arr= new int[]{3, 1, 5, 2, 7, 0};
        //selectionSort(arr);
        recursiveSelection(arr,arr.length,0);
        System.out.print(Arrays.toString(arr));
        
    }

}

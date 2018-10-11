/*
 *  Copyright Subhro Chatterjee
 */

package vinfinettechnology;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author subhro
 */

public class BubbleSortSwapCount {

    public static void main(String... arrays){
    
        int swapCount= 0;
        System.out.println("Enter the elements to be sorted");
        Scanner scan  = new Scanner(System.in);
        int ele = scan.nextInt();
        int[] arr  = new int[ele];
        
        for(int index = 0 ; index < arr.length; index++){
            arr[index] = scan.nextInt();
        }
        int length = arr.length;
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-i-1;j++){
                
                if( arr[j] > arr[j+1]){
                    ++swapCount;
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    //System.out.println("Position Elements : "+j +"swapped  with "+ j+1 );
                    //System.out.println("Element swappend in the position : "+ arr[j] + " element swapped with "+ arr[j+1]);
                
                }
            }
        }
        System.out.println("Elements in the array after swapping");
        System.out.println(Arrays.toString(arr));
        System.out.println("Total Swap count : "+swapCount);
    }
}
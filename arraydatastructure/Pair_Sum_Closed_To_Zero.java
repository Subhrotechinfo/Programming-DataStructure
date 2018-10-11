 package arraydatastructure;

import java.util.Arrays;
import java.util.Comparator;

 public class Pair_Sum_Closed_To_Zero implements Comparator{
 
    //Arrays.sort --> Dual-Pivot Quicksort by Vladimir Yaroslavskiy, 
    //Jon Bentley, and Joshua Bloch. Time Complexity - O(nlog n)
    //Exception - IllegalArgumentExcaption - fromIndex > toIndex
    //          ArrayIndexOutOfBoundsExpection
    //ClassCastException - if array contains elements that are mutually not Comparable
     static int arr[]={0,59,-9,69,-79,84};
     
     public int compare(Object obj1,Object obj2){
         return (int)obj2 - (int)obj1;
         }
     
     public static void sumClosedToZero(int arr[],int size){
         
         int curr_sum , closest_sum = Integer.MAX_VALUE ;
         int l_index = 0 ,r_index = size-1;
         int min_l_index = l_index , min_r_index = r_index;
         
         Arrays.sort(arr);
         System.out.println("Sorted Elements");
         for(Integer arry:arr){
             System.out.print(arry +" ");
         }
         
         while(l_index < r_index){  //Time Complexity - O(n)
                
             curr_sum = arr[l_index] + arr[r_index];
             if(Math.abs(curr_sum) < Math.abs(closest_sum)){    //put abs or else the result will defer
                 
                 closest_sum = curr_sum;
                 min_l_index = l_index;
                 min_r_index = r_index;
             }
             //If current sum is left of '0' move the left pointer or else move the right pointer
             if(curr_sum < 0)
                 l_index++;
             else
                 r_index--;
         }
         
         System.out.println("The two elements whose sum is closest to zero are "+arr[min_l_index]+" and "+arr[min_r_index]);
     }
     
     public static void main(String args[]){
         sumClosedToZero(arr,arr.length);
     }
}
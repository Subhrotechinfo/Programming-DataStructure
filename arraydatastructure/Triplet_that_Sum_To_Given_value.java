 package arraydatastructure;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

 public class Triplet_that_Sum_To_Given_value implements Comparator{
 
     static int arr[]={0,3,44,5,9,7,3};
     
     @Override
     public int compare(Object obj1,Object obj2){
             return (int)obj2 - (int)obj1 ;
         
     }
     
     public static int tripletSum(int arr[],int sum,int size){
         
         int leftIndex,rightIndex,tripletSum,index;
         Arrays.sort(arr);
         
         for(index = 0 ; index < size-2 ; index++ ){
             
             leftIndex = index+1;
             rightIndex = size-1;
             
             while(leftIndex < rightIndex){
                 
                 tripletSum=arr[index]+arr[leftIndex]+arr[rightIndex];
                 
                 if(tripletSum == sum){
                     System.out.println("Triplets are "+arr[index]+" "+arr[leftIndex]+" "+arr[rightIndex]);
                     return 1;
                 }
                 if(tripletSum < sum )
                     leftIndex++;
                 else
                     rightIndex--;
             }
         }
         return 0;
     }
     
     public static void main(String args[]){
         
         int res=tripletSum(arr,10,arr.length);
     }
}
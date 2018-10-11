 package arraydatastructure;

import java.util.Scanner;

 public class MajorityElementMooresAlgo {
 
     public static int getMajorityElement(int arr[],int size){
         int majorityIndex=0,count=1;
         for(int index=1;index<size;index++){
             if(arr[majorityIndex]==arr[index])
                 count++;
             else
                 count--;
             if(count == 0){
                 majorityIndex=index;
                 count=1;
             }
         }
         return arr[majorityIndex];
     }
     
     public static int isMajorityElement(int arr[],int size,int majorityElement){
         int count=0;
         for(int index=0;index<size;index++)
                if(arr[index] == majorityElement)
                        count++;
           return (count>size/2)?1:0;
         
     }
     
     public static void main(String args[]){
         Scanner scan = new Scanner(System.in);
         int size=scan.nextInt();
         int arr[]=new int[size];
         for(int index=0;index<arr.length;index++){
             arr[index]=scan.nextInt();
         }
         
         int majorityElement = getMajorityElement(arr, size);
         int result =isMajorityElement(arr, size, majorityElement);
         if(result == 1)
            System.out.println("Majority Element is "+majorityElement);
         else
            System.out.println("No Majority Element");
     }
}
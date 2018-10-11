 package sorting;

import java.util.Arrays;

 public class QuickSort {
    
     static int arr[] = {10, 7, 8, 9, 1, 5};
     public static int partition(int arr[],int p,int r){
         
         int x= arr[r]; //saving the right most element for comparison
         
         int i=p-1;
         
         for(int j=p;j<r;j++){
             if(arr[j]<=x){
                 i=i+1;
                 int temp = arr[i];
                 arr[i]= arr[j];
                 arr[j]=temp;
             }
         }
         
         //swap i+1 element with the pivot element
         int temp=arr[i+1];
         arr[i+1]=arr[r];
         arr[r]=temp;
         return i+1;
     }
       
     public static void qSort(int arr[],int p,int r){
         
         if(p<r){
             int q =partition(arr,p,r);
             qSort(arr,p,q-1);
             qSort(arr,q+1,r);
         }
     }
     public static void main(String args[]){
         int n= arr.length;
         qSort(arr, 0, n-1);
          System.out.println(Arrays.toString(arr));
     }
}
 package arraydatastructure;

 public class Product_Array_Without_Using_Divisor {
 
     
     static int arr[]=new int[]{10,20,30,40};
     
     public static void productArray(int arr[],int size){
         
         int prod[] = new int[size];
         int index,temp=1;
          
         for(index =0;index < size ; index++)
         {
             prod[index]=temp;
             temp*=arr[index];
         }
         temp=1;
         for(index = size-1;index >= 0 ; index --)
         {
             prod[index]*=temp;
             temp*=arr[index];
         }
         for(index = 0 ;index < size ; index ++)
             System.out.print(prod[index]+" ");
         
     }
     public static void main (String args[]){
         
         productArray(arr,arr.length);
         
     } 
     
}
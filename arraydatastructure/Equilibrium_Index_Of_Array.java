 package arraydatastructure;

 public class Equilibrium_Index_Of_Array {
 
     static int[] arr={7,2,1,4,6,4,0};
     public static void equilibriumIndex(int arr[],int size){
         
         int index , leftSum = 0 , sum = 0;
         
         //Find the sum of all the elements in the array
         for(index = 0; index < size ; index++)
             sum+=arr[index];
         
         for(index = 0;index < size ; index++){
             
             sum -= arr[index];
             if(leftSum == sum)
                 System.out.println("Equilibrium Index is : "+index );
             leftSum+=arr[index];
         }
     }
     
     public static void main(String args[]){
         
         equilibriumIndex(arr, arr.length);
     }
}
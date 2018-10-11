 package arraydatastructure;

 public class Duplicate_Time_O_n_and_Space_O_1 {

     //static int arr[] = new int[]{4, 2, 4, 5, 2, 3, 1}; 
     public static void printRepeating(int arr[],int size){
         int index;
         for(index = 0 ; index < size ; index++){
             
              if(arr[Math.abs(arr[index])] >= 0 )
                  arr[Math.abs(arr[index])] = -arr[Math.abs(arr[index])];
              else
                  System.out.print(Math.abs(arr[index]) + " ");
         }
     }
     
     public static void main(String args[]){
         
       int arr[] = new int[]{4, 2, 4, 5, 2, 3, 1};  
         printRepeating(arr,arr.length);
     }
     
}

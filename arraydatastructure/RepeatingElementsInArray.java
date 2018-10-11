 package arraydatastructure;

 public class RepeatingElementsInArray {
 
     static int arr[]= new int[]{4, 2, 4, 5, 2, 3, 1};
     
     public static void repeatingElementsArrayTraditional(int arr[],int size){
         //Time = O(n^2) space O(1)
         for(int index = 0 ; index < size ; index++){
             for(int j=index+1; j< size ; j++){
                 if(arr[index] == arr[j])
                     System.out.println("Repeating elements "+ arr[index] +  " " );
             }
         }
     }
     
     public static void printRepeating(int arr[] , int size){
         int count[] = new int[size];
         int index;
         for(index = 0; index<size ; index ++){   
             if(count[arr[index]] == -1)
                 System.out.print(arr[index]+" ");
             else
                 count[arr[index]] = -1;
         }
//         for(index = 0 ; index <size; index++)
//             System.ount.print()
     }
     public static void main(String args[]){
         
         //repeatingElementsArrayTraditional(arr,arr.length);
         printRepeating(arr , arr.length);
     }
}
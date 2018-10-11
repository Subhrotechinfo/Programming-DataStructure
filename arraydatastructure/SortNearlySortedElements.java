 package arraydatastructure;

 public class SortNearlySortedElements {
 
     static int arr[]= new int[]{9,6,5,0,8,2,7,1,3};
     public static void NearlySortedElments(int arr[],int size){
         int index,key,j;
         for(index = 1; index < size ; index++){
             
             key=arr[index];
             j=index - 1;
             while(j >= 0 && arr[j] > key){
                 arr[j+1]=arr[j];
                 j = j-1;
             }
             arr[j+1]=key;
         }
         for(index=0;index<size;index++)
             System.out.print(arr[index]+" ");
     }
     
     public static void main(String args[]){
         
         NearlySortedElments(arr,arr.length);
     }
     
}

package arraydatastructure;

 public class Array_Left_Rotation {
     static int arr[] = new int[]{1,2,3,4,5,6,7};     
//     public static void RotateLeftByOne(int arr[],int size){
//         
//         int first = arr[0];
//         int index;
//         for( index = 0; index < size-1 ; index++ )
//             arr[index]=arr[index+1];
//         
//         arr[index] = first;
//     }
//      
//     public static void RotateLeft(int arr[],int leftShift,int size){
//         
//         for(int index = 0 ; index < leftShift ; index++)
//             RotateLeftByOne(arr,size);
//     }
     public static void main(String args[]){
         int leftShift = 4;
//       RotateLeft(arr,2,arr.length);
         rotateLeft(arr , leftShift , arr.length);
         for(Integer ele :arr)
             System.out.print(ele+ " ");
     }
//Reversal approach II
     public static void reverseArray(int arr[],int leftIndex,int rightIndex){
         int temp;
         for(; leftIndex < rightIndex ; leftIndex++ , rightIndex-- ){
             
             temp = arr[leftIndex];
             arr[leftIndex] = arr[rightIndex];
             arr[rightIndex] = temp;
         }
     }
     
     public static void rotateLeft(int arr[],int leftShift,int size){
         
         reverseArray(arr, 0 ,leftShift-1);  //leftShift
         reverseArray(arr,leftShift,size-1);    //size - leftShift
         reverseArray(arr,0,size-1);
     }
}
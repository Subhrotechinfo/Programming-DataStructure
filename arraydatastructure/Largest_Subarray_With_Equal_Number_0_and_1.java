package arraydatastructure;

 public class Largest_Subarray_With_Equal_Number_0_and_1 {
 
     static int arr[]={0,1,1,1,0,1,1,0};
     
     public static void findLargestSubArray(int arr[],int arr_size){
         
         int maxSize = -1;  
         int startIndex = 0, min , max , index;
         int[] sum_upto = new int[arr_size];
         sum_upto[0] = (arr[0] == 0) ? -1 : 1;  //assigning all 0's as -1
         min = max = sum_upto[0];
         
         for(index = 1; index < arr_size ; index ++){
             //finding the sum and placing it in the sum_upto array
             sum_upto[index]=sum_upto[index-1]+((arr[index] == 0)? -1:1);
             if(sum_upto[index] < min)
                 min = sum_upto[index];
             if(sum_upto[index] > max)
                 max = sum_upto[index];
         }
         
         //finding the hash size
         int hash_size = max-min+1;
         int hash[]=new int[hash_size];
         int sum_so_far = 0;
         
         //initializing all the elements in the hash table to -1
         for(index = 0;index < hash_size ; index++)
             hash[index] = -1;
         
         
         //checking with the sum value in the sum_upto array and updating 
         //that "index value" of that element on seeing it for the first time in the hash table. 
         for(index =0 ; index < arr_size ; index++){
             
            //if any sum is found to be " 0 " then all elements to the left of it has has 
             //equal number of " 0's " & " 1's "
             if(sum_upto[index]==0){
                 
                 maxSize = index+1;     //updating the max size
                 startIndex=0;          //from the beginning 
                 continue;
             }
             sum_so_far = sum_upto[index] - min;
             
             //First time you see the sum update the hash value with the elements index
             if(hash[sum_so_far] == -1)     
                 hash[sum_so_far] = index;
             else{
                    //check and we can get the subarray
                 if((index - hash[sum_so_far]) > maxSize){
                     
                     maxSize = index - hash[sum_so_far];
                     startIndex = hash[sum_so_far]+1;
                 }
             }
         }
         if(maxSize == -1)
             System.out.println("No such subarray");
         else
             System.out.println("Largest sub array starts from "+startIndex+" to "+ (startIndex+maxSize-1));
         
     }
     public static void main(String args[]){
         
         findLargestSubArray(arr,arr.length);
         
     }
}
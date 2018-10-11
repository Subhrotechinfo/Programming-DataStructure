 package arraydatastructure;

 public class Implementation_of_maximum_difference_betw_two_in_an_array_such_that_larger_element_has_higher_index_than_smaller_element {
 
     static int arr[]={4,3,10,2,9,1,6};
     
     public static int getMaxDifference(int arr[],int size){
         
         int min_ele_so_far=arr[0];
         int maxdiff_so_far=arr[1]-arr[0];
         int curr_diff=arr[1]-arr[0];
         int index;
         
         for(index=1;index<size;index++){
             if(arr[index] < min_ele_so_far)//check if the current element is the smallest element so far or not
                  min_ele_so_far=arr[index];    //updating min ele so far
             
             else{
                 curr_diff = arr[index] - min_ele_so_far;
                 if(curr_diff > maxdiff_so_far)//checking
                     maxdiff_so_far=curr_diff;//update the max diff
             }
             
         }
         return maxdiff_so_far;
     }
     
     public static void main(String args[]){
         
         int size=arr.length;
         int max_diff_so_far=getMaxDifference(arr,size);
         System.out.println("Max Difference is :"+max_diff_so_far);
     }
     
}
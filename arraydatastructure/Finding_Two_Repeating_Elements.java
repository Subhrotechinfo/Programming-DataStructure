package arraydatastructure;

public class Finding_Two_Repeating_Elements {
 
     //total numbers present here is 7 and the range is b/w 1 - 5.
     
     static int arr[]=new int[]{ 2 , 4 , 2 , 5 , 4 , 3 , 1 };
     public static void main(String args[]){
         
      printRepeating(arr,arr.length);
         
     }
     
     public static void printRepeating(int arr[],int size){
         
         int set_bit,x=0,y=0,xor_result = arr[0] , n = size - 2,index;
         
        //Finding the XOR of each elements present in the array.
        for(index = 0 ; index <size ;index++){
            xor_result ^=arr[index]; 
        }
        //Finding XOR of all the elements from 1 - n
        for( index = 0; index <= n ; index++){
            xor_result ^=index ;
        }
        
        //getting the rightmost set bit in set_bit_pos
        set_bit = xor_result & ~(xor_result-1);
        //
        for(index = 0 ; index < size ; index++){
            int a=arr[index] & set_bit;
            if(a!=0)
                x = x^arr[index];
            else
                y=y^arr[index];
        }
        
        for(index  = 1 ; index < n ; index++){
            int a = index &set_bit;
            if(a != 0)
                x = x^index;
            else 
                y = y^index;
        }
        
        System.out.println("Two repeated elements are:");
        System.out.println(x + " " +y);
     }
}
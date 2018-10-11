 package arraydatastructure;

import java.util.HashMap;

 public class Number_Occurring_Odd_no_of_times {
 
     static int arr[]={2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2 };
     
     public static void main(String args[]){
         
         //System.out.println("Implementing Native : "+getOddOccurence(+arr,arr.length));
         //System.out.println("Implementing HashMap : "+getOccurenceHashMap(arr, arr.length));
         System.out.println("Implementing XOR : "+getOccuranceXOR(arr, arr.length));
     }
     
     public static int getOccurenceHashMap(int arr[],int size){
         
         HashMap<Integer,Integer> hm= new HashMap<>();
         
         int index;
         for(index=0;index<size;index++){
             
             if(hm.containsKey(arr[index])){
                  
                 int value=hm.get(arr[index]);
                 hm.put(arr[index], value+1);
                  
             }else{
                 hm.put(arr[index] , 1);
             }
         }
         for(Integer key : hm.keySet()){
             
             if(hm.get(key)%2!=0)   //return the value associated with this key
                 return key;
         }
         return -1;
     }
     
     public static int getOccuranceXOR(int arr[],int size){
         
         int index,res=0;
         for(index=0;index<size;index++){
             res=res^arr[index];
         }
         return res;
     }
     
     
     
     public static int getOddOccurence(int arr[],int size){
         
         int index;
         for(index=0;index<size;index++){
             int count =0;
             for(int j=0;j<size;j++){
                 if(arr[index] == arr[j])
                     count++;
             }
             if(count%2 != 0)
                 return arr[index];
         }
         return -1;
     }
}
 package arraydatastructure;

 public class BinarySearch {
 
     public static void main(String args[]){
         int arr[]= {10,20,56,78,202,1265};
         int n=arr.length;
         int L=0,R=n-1,target=56;
         
         int res=binarySearch(arr,L,R,target);
         
         System.out.println(res);
     }
     
     public static int binarySearch(int arr[],int L,int R,int target){
         int mid=(L+R)/2;
         
         if(arr[mid]==target)
             return mid;
         else if(arr[mid]< target)
             return binarySearch(arr,mid+1,R,target);
             
         else
             return binarySearch(arr,L,mid-1,target);
     }
     
//     public static int binarySearch(int arr[],int target){
//         int L,R,n=arr.length;
//          L=0;
//          R=n-1;
//          
//          while(L <= R){
//              
//              int mid= (L+R)/2;
//              if(arr[mid] == target)
//                  return mid;
//              else if(arr[mid] < target)
//                  L=mid+1;  
//              else
//                  R=mid-1;
//          }
//          return -1;
//     }
}
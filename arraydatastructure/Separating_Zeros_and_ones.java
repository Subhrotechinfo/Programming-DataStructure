package arraydatastructure;

public class Separating_Zeros_and_ones {

    static int arr[]={ 0,1,0,0,0,1,0,1 };
    //always left pointer should be less that the right pointer
    public static void seperate0and1(int arr[],int size){
    
        int leftIndex = 0,rightIndex = size-1;
        
        while(leftIndex < rightIndex){
            
            while((arr[leftIndex] == 0) && (leftIndex < rightIndex))
                leftIndex++;
            while((arr[rightIndex] == 1) && (rightIndex > leftIndex))
            rightIndex--;
            if(leftIndex < rightIndex){
                //swapping
                arr[leftIndex++] = 0;
                arr[rightIndex--] = 1;
            }
        }
    }
    
    public static void printArray(int arr[],int size){
        System.out.println("Printing array: ");
        for(int ele:arr)
            System.out.print(ele+" ");
            
    }
    public static void main(String args[]){
        seperate0and1(arr, arr.length);
        printArray(arr,arr.length);
    }
}
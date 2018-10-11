package arraydatastructure;

import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int arr[],int target){
        
        for(int index=0;index<arr.length;index++){
            if(arr[index]== target)
                return index;
        }
        return -1;
    }
    
    public static void main(String args[]){
        
        System.out.println("Enter number of elements in array: ");
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr= new int[n];
        
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println("Enter target");
        int target=scan.nextInt();
        int found=linearSearch(arr,target);
        System.out.println("Founded element at "+found+" index.");
        
        //Printing
//        for(int i=0;i<n;i++){
//        System.out.println(arr[i]);
//        }
//        
    }
}

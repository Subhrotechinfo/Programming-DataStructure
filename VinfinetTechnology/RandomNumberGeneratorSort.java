/*
 *  Copyright Subhro Chatterjee
 */
package vinfinettechnology;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * @author subhro
 */
public class RandomNumberGeneratorSort {

    public static void main(String... arrays){
        
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter Number of Elements");
        long elements = scan.nextLong();
        
        long[] arr = new long[(int)elements];
        System.out.println("Elements Entered");
        long arrayElement=0;
        Random rand= new Random();
        for(int index = 0 ; index< arr.length ; index++){
            long num = rand.nextInt(100000000);
            
            arrayElement=num;
            System.out.print(arrayElement+" ");
            //taking input from user for array
            if(arrayElement >= 100000 && arrayElement <= 100000000){
                arr[index]=arrayElement;
            }
            else
                continue;
        }
        long swapCount = 0L;
        long length = arr.length;
        for(int i=0;i<length-1;i++){
            for(int j=0;j<length-i-1;j++){
                
                if( arr[j] > arr[j+1]){
                    ++swapCount;
                    long temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Elements in the array after swapping");
        System.out.println(Arrays.toString(arr));
        System.out.println("Total Swap count : "+swapCount);
    }
}
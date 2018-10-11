/*
 *  Copyright Subhro Chatterjee
 */

package stringinterviewprograms;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * @author subhro
 */

public class StringWordReverse {

    public static void main(String... array){
        System.out.println(stringWordReverse("Welcome to geeksforgeek"));
        System.out.println(stringWordReverse("I am lov indi"));
        stringWordReverse2("i love india");
        stringWordReverse3("Subhro chatterjee");
    }
    
    public static String stringWordReverse(String str){
        
        Pattern pattern =  Pattern.compile("\\s");
        String[] arr =  pattern.split(str);
        String result = "";
        
        for(int index = 0 ; index < arr.length ; index++ ){
            if( index == arr.length-1 )
                result = arr[index] +result;
            else
                result =" " +arr[index] + result;
        }
        return result;
    }
    
    public static void stringWordReverse2(String str){
        Pattern pattern = Pattern.compile("\\s");
        String[] arr = pattern.split(str);
        String nstr = " " ; 
        for(int index = arr.length-1 ; index>=0 ; index--)
            nstr += arr[index]+" " ;
        
        System.out.println(nstr);
    }
    
    public static void stringWordReverse3(String str){
        Pattern pattern = Pattern.compile("\\s");
        String [] arr = pattern.split(str);
        
        for(int index = 0 ; index < arr.length/2 ; index++){
            String temp = arr[index];
            arr[index] = arr[arr.length-1-index];
            arr[arr.length-1-index] = temp;
        }
     System.out.println("Approach 3 :"+Arrays.toString(arr));   
    }         
}
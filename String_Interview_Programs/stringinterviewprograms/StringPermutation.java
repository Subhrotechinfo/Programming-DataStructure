/*
 *  Copyright Subhro Chatterjee
 */

package stringinterviewprograms;

/**
 * @author subhro
 */

public class StringPermutation {
    public static void main(String... array){
        String str = "ABC";
        int n =str.length();
        permute(str,0,n-1);
    }
    
    private static void permute(String str , int left , int right){
        
        //permutation program
        if(left == right)
            System.out.print(str+" ");
        else{
            for(int index  = left ; index <= right ; index++  ){
                str = swap(str , left , index);
                permute(str , left+1 , right);
                str = swap(str , left , index);
            }
        }
    }//end permute function
    
    public static String swap(String str , int i, int j ){
        //swap program
        char temp ;
        char[] charArray = str.toCharArray();
        
        temp = charArray[i];
        charArray[i]= charArray[j];
        charArray[j]= temp;
        return String.valueOf(charArray);
    }
    
}
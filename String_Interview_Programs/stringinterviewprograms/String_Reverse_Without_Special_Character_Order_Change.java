/*
 *  Copyright Subhro Chatterjee
 */
package stringinterviewprograms;
import java.util.Arrays;

/**
 * @author subhro
 */

//String reverse without changing the position of special characters
public class String_Reverse_Without_Special_Character_Order_Change {

    public static void main(String[] args){
        reverseApproach1("Su-b@h$roe");
    }
    
    public static void reverseApproach1(String str){
        
        char[]  charArray = str.toCharArray();
        char[] temp = new char[charArray.length];        
         int ptr = 0, j= 0; 
         //coping the characters to temp
         for(int index = 0 ; index < charArray.length ; index++){
             char c = charArray[index];
             if( ((int)c) >= 65 &&  ((int)c) <= 90 || ((int)c) >= 97 && ((int)c) <= 122 )
             {
                 temp[ptr] =c; ptr++;
             }
         }
         --ptr;     // ptr = 5
         while(j<ptr){
             //swapping in temp
             if(temp[ptr] != ' '){
                    char t = temp[ptr];
                    temp[ptr] = temp[j];
                    temp[j] = t;
                    j++;
                    ptr--;
             }
         }
         System.out.println("String without special char : "+Arrays.toString(temp));
         ptr=0;
         for(int index = 0 ; index < charArray.length ; index++){
             //coping back to original
             char c = charArray[index]; 
             if( ((int)c) >= 65 &&  ((int)c) <= 90 || ((int)c) >= 97 && ((int)c) <= 122 )
                 charArray[index]=temp[ptr++];
                  
         }
         //System.out.println("Original :  "+str);
         for(char ch: charArray)
             System.out.print(ch);
    }
}
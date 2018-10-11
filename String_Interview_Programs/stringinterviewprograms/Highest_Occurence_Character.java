/*
 *  Copyright Subhro Chatterjee
 */

package stringinterviewprograms;

import com.sun.xml.internal.ws.util.ASCIIUtility;
import java.util.Arrays;
/**
 * @author subhro
 */
public class Highest_Occurence_Character {
    static int max=-1;
    private static char getMaxOccurenceChar(String str){
        
        int[] count = new int[256];
        
        //int len  = str.length();
        for(int index = 0; index < str.length() ; index++)
                count[str.charAt(index)]++;
        
        char result = ' ';
        
        for(int index = 0 ; index <str.length() ; index++){
            
            if( max < count[str.charAt(index)] ){
                max = count[str.charAt(index)];
                result = str.charAt(index);
            }
        }
             System.out.println("Total count: "+max);
        return result;
  }
    public static void main(String... array){
        System.out.println(" Max occuring character is : "+ getMaxOccurenceChar("aaa aaaabbbchcgsaaaaaaaaAAAA") );
    }
}
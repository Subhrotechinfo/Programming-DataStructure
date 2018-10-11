/*
 *  Copyright Subhro Chatterjee
 */
package stringinterviewprograms;
/**
 * @author subhro
 */
public class StringShuffle_Interleaving {

    public static void main(String... array){
        
        System.out.println(interleavingString("abc", "def", "dabecf"));
        //System.out.println(interleavingString("bac", "def", "dabecf"));
        //System.out.println(interleavingString("otto", "anna", ""));
        System.out.println(" Printing Interleaving String ");
        printAllInterleaving("ABC","XYZ","");
    }
    
    public static boolean interleavingString(String string1 , String string2, String string3){
        
        if( string1.length() + string2.length() != string3.length() ){
            return false;
        }
         
        char[] str1 = string1.toCharArray();
        char[] str2 = string2.toCharArray();
        
        int ptr1 = 0 , ptr2 = 0;
        
        for(char c : string3.toCharArray()){
            
            if(ptr1 < string1.length() && c == str1[ptr1]){
                ptr1++;
                continue;               //continue with the next iteration
            }else if(ptr2 < string2.length() && c == str2[ptr2]){
                ptr2++;
                continue;               //continue with the next iteration
            }else{
                return false;
            }
        }
        return true;
    }
    
    public static void printAllInterleaving(String str1,String str2,String interleavingString){
        
        //If  string 1 is null print string 2 and return
        if(str1  == null){
            System.out.print(str2);
            return;
        }
        
        //If string 2 is null then print string 1 and return
        if(str2 == null){
            System.out.print(str2);
            return;
        }
        
        //If string 1 and string 2 length becomes 0 , it means all characters from str1
        //and str2 is present in interleaving , print interleavingString
        if(str1.length() == 0 && str2.length() == 0){
            System.out.println(interleavingString);
        }
        
        //pick characters from string 1 untill string 1 length is empty.
        if(str1.length() != 0){
            printAllInterleaving(str1.substring(1) , str2 , interleavingString+str1.charAt(0) );
        }
        
        //pick character from string 2 untill string 2 length is empty
        if(str2.length() != 0){
            //pick character from string 2 and append it in interleavingString. 
            //In next recursive call remove picked character from string 2.    
            printAllInterleaving(str1 , str2.substring(1) , interleavingString+str2.charAt(0));
        }
    }
}
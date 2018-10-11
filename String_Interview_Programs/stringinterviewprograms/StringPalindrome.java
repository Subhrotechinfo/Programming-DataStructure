/*
 *  Copyright Subhro Chatterjee
 */

package stringinterviewprograms;

/**
 * @author subhro
 */

public class StringPalindrome {
    static String nstr = "";
    public static void main(String... array){
        String s = "Madam";
         String check = paliString(s.toLowerCase());
         
        if(check.equalsIgnoreCase("Madam"))
            System.out.println("Pali");
        else
            System.out.println("Not Pali");
    }
    
    public static String paliString(String str ){
        //using recursion
        if(str == null || str.length()<=1)
            return str ;
        return paliString( str.substring(1)) + str.charAt(0) ;
    }
}


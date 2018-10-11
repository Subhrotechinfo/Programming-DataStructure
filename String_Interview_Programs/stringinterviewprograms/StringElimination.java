/*
 *  Copyright Subhro Chatterjee
 */
package stringinterviewprograms;
/**
 * @author subhro
 */
//String 1 & String 2  --> String 1 should eliminate the contents of String 2.

public class StringElimination {
    
    public static void main(String[] args){
        
        eliminate("halloween","halcyon");
    }
    
    public static void eliminate(String str1,String str2){
        String tempstr=str1 ;
        int len1 = str1.length(),len2=str2.length();
        for(int i = 0 ; i < len1 ; i++){
            char c1 = str1.charAt(i);
            for(int j= 0 ;  j < len2 ; j++){
                char c2 = str2.charAt(j);
                if(c1 == c2){
   //For char, from '\u0000' to '\uffff' inclusive, that is, from 0 to 65535
  // The default/Unicode Transformation Format (UTF-16) value of "char" is '\u0000' 
                    str1=str1.replace(str1.charAt(i), '\u0000');
                }
            }
        }
        for(int i = 0 ; i < len2 ; i++){
            char c1 = str2.charAt(i);
            for(int j= 0 ;  j < len1 ; j++){
                char c2 = tempstr.charAt(j);
                if(c1 == c2){
                    str2=str2.replace(str2.charAt(i), '\u0000');
                }
            }
        }
        System.out.println("String 1 : "+str1);
        System.out.println("String 2 : "+str2);
    }
}
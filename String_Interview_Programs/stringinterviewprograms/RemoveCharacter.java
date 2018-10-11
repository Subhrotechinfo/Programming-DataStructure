/*
 *  Copyright Subhro Chatterjee
 */

package stringinterviewprograms;

/**
 * @author subhro
 */

public class RemoveCharacter {

    public static void main(String... array){
        System.out.println( " Approach 1 : "+removeCharInString("My"
                + "name is subhro chatterjee",'a') );
        
        System.out.println(" Approach 2 : "+removeChar2("Subhro chatterjee",'h'));
                 
    }
    public static String removeCharInString(String str, char removechar){
        
        if(str == null)         return "";        
        StringBuilder sb =  new StringBuilder();
        
        for(int index = 0 ; index < str.length() ; index++){
            char ch = str.charAt(index);
            if(ch == removechar )
                continue ;
            sb.append(ch);
        }
        return sb.toString();
    }
    
    public static String removeChar2(String str , char c){
        
        String word ="";
        for(int index = 0 ; index  < str.length() ; index++){
            if(str.charAt(index) != c)
                word+=str.charAt(index);
        }
        return word;
    }
}
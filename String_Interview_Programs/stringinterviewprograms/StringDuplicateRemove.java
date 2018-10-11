/*
 *  Copyright Subhro Chatterjee
 */

package stringinterviewprograms;

import java.util.LinkedHashSet;

/**
 * @author subhro
 */

public class StringDuplicateRemove {
    
    public static void main(String... array){
        
        removeDupli("bananas"); 
    }
    
    public static void removeDupli(String str){
        
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        
        for(int index = 0 ; index < str.length() ;  index++){
            lhs.add(str.toLowerCase().charAt(index));
        }
        for(Character c : lhs)
            System.out.print(c+" ");
    }
}
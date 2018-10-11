/*
 *  Copyright Subhro Chatterjee
 */
package stringinterviewprograms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author subhro
 */

public class DuplicateCharacters {
    public static void main(String[] array){
        
        printDuplicateCharacter("Programming");
        System.out.println("First Repeating character : "+firstRepeatingCharacter("GeeksforGeek"));
        
    }
    
    public static void printDuplicateCharacter(String word){
        char[] c  = word.toCharArray();        
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        
        for(Character ch : c){
            if(map.containsKey(ch))
                map.put( ch , map.get(ch)+1 );
            else
                map.put( ch , 1 );
        }
        //Iterate
        System.out.println("Duplicate characters : "+ word);
       Set <Map.Entry<Character,Integer> > entrySet = map.entrySet();
       for(Map.Entry<Character,Integer> entry : entrySet)
            if(entry.getValue() > 1){
                System.out.println(entry.getKey()+ " : "+ entry.getValue());
            }
    }
    
    public static char firstRepeatingCharacter(String str){
        char[] arr = str.toCharArray();
        HashSet<Character> hashSet = new HashSet<>();
        for(int index = 0 ; index < arr.length; index++){
            char c = arr[index];
            if(hashSet.contains(c)){
                return c;
            }else{
                hashSet.add(c);
            }
        }//End For
        return '\0';
    }
}


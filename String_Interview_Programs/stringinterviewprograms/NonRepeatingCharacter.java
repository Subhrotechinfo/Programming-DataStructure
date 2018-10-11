/*
 *  Copyright Subhro Chatterjee
 */

package stringinterviewprograms;

import java.util.HashMap;

/**
 * @author subhro
 */

public class NonRepeatingCharacter {
    
    static final int NO_OF_CHARS = 256;
    
    static HashMap<Character,CountIndex> hm =  
            new HashMap<Character,CountIndex>(NO_OF_CHARS);
    
    static void getCharCountArray(String str){
        for(int index = 0 ; index < str.length() ; index++){
            
            if(hm.containsKey(str.charAt(index)))
                hm.get(str.charAt(index)).incCount();
            else
                hm.put(str.charAt(index), new CountIndex(index));
        }
    }
    
    static int firstNonRepeating(String str){
        getCharCountArray(str);
        int result = Integer.MAX_VALUE ;
        
        for(int i = 0 ; i < str.length(); i++){
            if(hm.get(str.charAt(i)).count == 1 && result > hm.get(str.charAt(i)).index)
                    result = hm.get(str.charAt(i)).index;
        }
        return result ;
    }
    
    public static void main(String... array){
        String str = "geekforgeek";
        int index = firstNonRepeating(str);
        System.out.println(index == Integer.MAX_VALUE ? "Either all the characters are repeating"
                + " or string is empty ":" First non-repeating characters is : " +str.charAt(index));
        
    }
}

class CountIndex{
    int count,index;
    
    public CountIndex(int index){
        this.count=1;
        this.index=index;
    }
    public void incCount(){
        this.count++;
    }
}
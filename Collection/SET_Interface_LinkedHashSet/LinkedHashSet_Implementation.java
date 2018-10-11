/*
 *  Copyright Subhro Chatterjee
 */

package SET_Interface_LinkedHashSet;

import java.util.Arrays;
import java.util.LinkedHashSet;

/**
 * @author subhro
 */

public class LinkedHashSet_Implementation {
    
    public static void main(String... args){
    
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>( Arrays.asList( new String[]{"A","B","C","D","E","F"}));
        System.out.println("Elements in LinkedHashSet : "+ linkedHashSet);
        
        System.out.println("Size : "+linkedHashSet.size());
        System.out.println("Remove : "+linkedHashSet.remove("A"));
        System.out.println("Checking for elements : "+linkedHashSet.contains("C"));
        
    }
}
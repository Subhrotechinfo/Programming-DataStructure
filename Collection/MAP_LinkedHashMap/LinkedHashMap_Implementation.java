/*
 *  Copyright Subhro Chatterjee
 */

package MAP_LinkedHashMap;

import java.util.LinkedHashMap;

/**
 * @author subhro
 */

public class LinkedHashMap_Implementation {
    
    public static void main(String... array){
        
        LinkedHashMap<Integer,String> lhmap =  new LinkedHashMap<>();
        lhmap.put(1,"Geeks");
        lhmap.put(2,"for");
        lhmap.put(3,"Geeks");
        lhmap.put(4, "Code");
        lhmap.put(5, "Hackathon");
        
        System.out.println("Size : "+lhmap.size());
        System.out.println("Getting 2nd element : "+lhmap.get(2));
        System.out.println("Contains key 1 : "+ lhmap.containsKey(1));
        System.out.println("contains value : "+lhmap.containsValue("Code"));
        System.out.println("Removing : "+lhmap.remove(3));
        
        System.out.println("Elements : "+lhmap.toString());
    }
}
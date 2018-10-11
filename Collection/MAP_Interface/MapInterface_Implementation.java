/*
 *  Copyright Subhro Chatterjee
 */

package MAP_Interface;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author subhro
 */

public class MapInterface_Implementation {
    
    public static void main(String... array){
        
        HashMap <Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,new String("A"));
        hashMap.put(2,new String("B"));
        hashMap.put(3,new String("C"));
        hashMap.put(4,new String("D"));
        hashMap.put(5,new String("E"));
        
        //return the Set view 
        Set<Map.Entry<Integer,String>> set = hashMap.entrySet();
        for(Map.Entry<Integer,String> mapEntity : set){
            System.out.print(mapEntity.getKey()+" : ");
            System.out.println(mapEntity.getValue());
        }
    }
}
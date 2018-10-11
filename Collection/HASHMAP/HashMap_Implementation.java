/*
 *  Copyright Subhro Chatterjee
 */

package HASHMAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author subhro
 */

public class HashMap_Implementation {

    public static void main(String... array){
    
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1, "Geek");
        hashMap.put(2, "for");
        hashMap.put(3, "Geeks");
        
        
        if(!hashMap.isEmpty()){
            for(int index = 1 ; index <= hashMap.size() ; index++)
            System.out.println("Values : "+index);
            
        }
        
        
        if(hashMap.containsKey(1))
            System.out.println("Getting its value : "+hashMap.get(1));
        
        System.out.println("Getting the KeySet : "+hashMap.keySet().toString());
        //System.out.println("Getting the KeySet : "+hashMap.keySet());
        
        System.out.println("Getting the values : "+hashMap.values());
        System.out.println("Removing a value : "+hashMap.remove(3));
        hashMap.put(3, "Geeks");
        hashMap.put(4, "Compiler");
        System.out.println("Replacing a value : "+hashMap.replace(3, "Replaced Compiler value"));

        System.out.println("Displaying elements : "+hashMap);
        Set<Map.Entry<Integer,String>> set = hashMap.entrySet();
        System.out.println("For EACH");
        for(Map.Entry<Integer,String> s : set)
            System.out.print(" "+s);
        
        System.out.println("");
        Iterator<Map.Entry<Integer,String>> itr = hashMap.entrySet().iterator();
        while(itr.hasNext()){
            
            /*Map.Entry<Integer,String> entry =*/ itr.next();//Saving the next value
            //System.out.println("Entry :"+entry.toString());
            System.out.println(itr.next());
            itr.remove();
            System.out.println("Removing iteratively "+hashMap);
            
        }
    }
}
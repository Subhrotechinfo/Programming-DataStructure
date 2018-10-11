/*
 *  Copyright Subhro Chatterjee
 */

package SET.Set_Implementation;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author subhro
 */

public class Set_Implementation {

    public static void main(String... array){
        
        Set<String> hashSet = new HashSet<>();
        hashSet.add("C");
        hashSet.add("B");
        hashSet.add("A");       //duplicate
        hashSet.add("D");
        hashSet.add("E");
        hashSet.add("A");       //duplicate
        hashSet.add("F");
        hashSet.add("A");
        
        System.out.println(" HashSet : " + hashSet);
        Set<String> treeSet  = new TreeSet<>(hashSet);
        System.out.println("Tree Set : "+treeSet);
        
    }
}
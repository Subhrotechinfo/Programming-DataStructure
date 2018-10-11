/*
 *  Copyright Subhro Chatterjee
 */

package SET_TreeSet;

import java.util.TreeSet;

/**
 * @author subhro
 */

public class TreeSet_Implementation {
    
    public static void main(String...array){
        
        TreeSet treeSet = new TreeSet();
        treeSet.add("3");
        treeSet.add("5");
        treeSet.add("2");
        treeSet.add("7");
        treeSet.add("9");
        //treeSet.add(null);        //Null Pointer Exception
        System.out.println(treeSet);
        
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("GeeksforGeeks");
        treeSet2.add("Compiler");
        treeSet2.add("practice");
        
        System.out.println("First : "+treeSet2.first());
        System.out.println("Last :"+treeSet2.last());
        
        System.out.println("HeadSet : "+treeSet2.headSet("O"));
        System.out.println("TailSet : "+treeSet2.tailSet("G"));
        System.out.println("SubSet  : "+treeSet2.subSet("C", "P"));
        
    }
}
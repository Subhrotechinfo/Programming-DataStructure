/*
 *  Copyright Subhro Chatterjee
 */

package SET.Set_Implementation;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author subhro
 */

public class Set_Extended {
    
    public static void main(String... arrray){
        
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.addAll( Arrays.asList(new Integer[]{1,2,3,6,5,4,7,8,9,11}));
        
        System.out.println("HashSet : "+hashSet.toString());
        
        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.addAll(  Arrays.asList(new Integer[]{3,6,5,4,7,6,5,1,}));
        System.out.println("HashSet 2 : "+hashSet2);
        //Union
        HashSet<Integer> unionHashSet = new HashSet<>(hashSet);
        unionHashSet.addAll(hashSet2);
        System.out.println("Union HashSet :"+unionHashSet);
        
        //Intersection
        HashSet<Integer> interHashSet  = new HashSet<>(hashSet2);
        interHashSet.retainAll(hashSet);
        System.out.println("Intersection HashSet : "+interHashSet);
        
        //Difference
        HashSet<Integer> diffHashSet = new HashSet<>(hashSet);
        diffHashSet.removeAll(hashSet2);
        System.out.println("Difference HashSet : "+diffHashSet);
        
    }

}
/*
 *  Copyright Subhro Chatterjee
 */

package SETInterface.HashSet;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author subhro
 */

public class HashSet_Implementation {

    public static void main(String... array){
        
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(new Integer[]{1,2,3,6,5,4,7,8,9}));
        System.out.println("HashSet Elements : "+hashSet);
    }
}
/*
 *  Copyright Subhro Chatterjee
 */

package TreeMap_Implementation;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author subhro
 */

public class TreeMapImplementation {
    
    static int[] arr = new int[]{10, 34, 5, 10, 3, 5, 10};
    
    public static void printFreq(int arr[]){
        
        TreeMap<Integer,Integer> tmap =  new TreeMap<>();
        for(int index = 0  ;  index < arr.length ; index++){
            
            Integer ele  =  tmap.get(arr[index]);
            
            if(ele ==  null )
                tmap.put(arr[index], 1);
            else
                tmap.put(arr[index], ++ele);
        }
        for(Map.Entry e : tmap.entrySet())
                System.out.print( e + " " );
    }
    public static void main(String... array){
        printFreq(arr);
    }
}
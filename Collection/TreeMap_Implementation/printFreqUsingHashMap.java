/*
 *  Copyright Subhro Chatterjee
 */

package TreeMap_Implementation;

import java.util.HashMap;
import java.util.Map;

/**
 * @author subhro
 */

public class printFreqUsingHashMap {

    static int arr[] = new int[]{10, 34, 5, 10, 3, 5, 10};
    
    public static void printFreq(int arr[]){
        
        HashMap<Integer, Integer> hmap = new HashMap<>();
        
        for(int index = 0 ; index < arr.length ; index++ ){
            
            Integer ele = hmap.get(arr[index]);
            //System.out.println("Element value : "+ele);
            if(ele == null)
                hmap.put(arr[index], 1);
            else
                hmap.put(arr[index], ++ele);
        }
        
        for(Map.Entry ele : hmap.entrySet())
            System.out.print(ele.toString()+ " ");
    }
    
    public static void main(String... array){
        
        printFreq(arr);
    }
}

/*
 *  Copyright Subhro Chatterjee
 */

package ListInterface.ArrayList;

import java.util.ArrayList;

/**
 * @author subhro
 */

public class ArrayList_Implementation {

    public static void main(String... args){
        
        int n = 5;
        ArrayList<Integer> arraylist = new ArrayList<>();
        for(int index = 0 ; index < 10 ; index++)
        arraylist.add(index);
        
        System.out.println("Before Removal :"+arraylist);
        arraylist.remove(3);
        
        System.out.println("After Removal   :"+arraylist);
        
    }
    
}

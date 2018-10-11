/*
 *  Copyright Subhro Chatterjee
 */

package ListInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author subhro
 */

//Positional Access

public class List_Implementation {
    
    public static void main(String... args){
        
        List list = new ArrayList();
        list.add(0,10);         //Positional Add
        list.add(1,25);         //Positional add
        list.add(2,55);         //Positioanl add
        
        List list2 = new ArrayList();
        list2.add(0,25);
        list2.add(1,57);
        list2.add(2,45);
        
        //list.addAll(1,list2);       //adding the 1st list 
        
        System.out.println(list);
        
        list.remove(1);
        
        System.out.println(" Getting the second element "+list.get(1));
        
        list.set(1, 12);
        System.out.print(list);
    }
}

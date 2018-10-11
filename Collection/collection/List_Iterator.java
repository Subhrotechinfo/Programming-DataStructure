/*
 *  Copyright Subhro Chatterjee
 */

package collection;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * @author subhro
 */
//Applicable for List Collections --> ArrayList , LinkedList

public class List_Iterator {
    
    public static void main(String... type){
        System.out.println("Checking the feasibility");
        
        ArrayList arraylist = new ArrayList();
        for(int index = 0 ; index < 10 ; index++)
            arraylist.add(index);
        
        ListIterator itr = arraylist.listIterator();
        
        while(itr.hasNext()){
            
            int ele =(Integer)itr.next();
            
            if(ele%2 != 0){
                itr.remove();
            }
        }
        System.out.println();
        System.out.println(arraylist);
        //System.out.println(arraylist.toString());
    }
}
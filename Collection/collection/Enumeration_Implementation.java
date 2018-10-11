/*
 *  Copyright Subhro Chatterjee
 */

package collection;

import java.util.Vector;

/**
 * @author subhro
 */

public class Enumeration_Implementation {
    
    public static void main(String args[]){
        
        Vector vector = new Vector();
        for(int index = 0; index <10 ; index++)
            vector.addElement(index);
        System.out.println(vector);
        
        
    }
    
}
/*
 *  Copyright Subhro Chatterjee
 */

package Vector;

import java.util.Vector;

/**
 * @author subhro
 */

public class Vector_Implementation {

    public static void main(String... array){
        
        Vector<Object> vector = new Vector<>();
        vector.add(25);
        vector.add(55);
        vector.add(65);
        vector.add(45);
        vector.add(75);
        vector.add(15);
        
        vector.add(2,"Geeks");
        
        System.out.println(vector);
        
        Vector vector2 = new Vector();
        vector2.add("Geeks");
        vector2.add("for");
        vector2.add("Geeks");
        //vector.addAll(vector2);
        //vector.addAll(2,vector2);
        //System.out.println(vector);
        
        Vector cloneVector = new Vector();
        cloneVector = (Vector)vector.clone();
        System.out.println("Cloned Vector :"+cloneVector);
        
        System.out.println("Contains checking :" +vector.contains("Geeks"));
        
        System.out.println("Ensure Capacity: ");
        vector.ensureCapacity(22);  //void return type
        System.out.println("Checking the capacity : "+vector.capacity());
        
        System.out.println("Hashcode : " +vector.hashCode());
        
        
    }
}

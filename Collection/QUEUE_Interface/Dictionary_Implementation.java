/*
 *  Copyright Subhro Chatterjee
 */
package QUEUE_Interface;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

/**
 * @author subhro
 */

public class Dictionary_Implementation {
    
    public static void main(String... array){
        
        Dictionary<Integer,String> dic = new Hashtable();
        dic.put(1, "Subhro");
        dic.put(2,"Geeks");
        dic.put(3, "for");
        dic.put(4, "Geeks");
        
         Enumeration en =  dic.elements();
         while(en.hasMoreElements()){
             
             System.out.print(en.nextElement()+" ");
         }
    }
}
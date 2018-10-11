/*
 *  Copyright Subhro Chatterjee
 */
package ListInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author subhro
 */
public class List_Interface_Range_View {
    
    public static void main(String... array){
        
        List<String> list =  new ArrayList<>();
        list.add("geeks");
        list.add("for");
        list.add("geeks");
        list.add("IDE");
        list.add("Courses");
        list.add("practice");
        
        List<String> range = new ArrayList<String>();
        range = list.subList(1, 3);         //Including the fromIndex -- excluding the toIndex
        System.out.println(range);
        
    }
}
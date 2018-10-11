/*
 *  Copyright Subhro Chatterjee
 */

package ListInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author subhro
 */

//Searching
public class List_Implementation_Searching {

    public static void main(String... args){
        
        List<String> list = new ArrayList<>();
        list.add("Geeks");
        list.add("for");
        list.add("Geeks");
        
        System.out.println("Index Of 'Geeks' is: "+ list.indexOf("Geeks"));
        System.out.println("Index of last 'Geeks' is "+ list.lastIndexOf("Geeks"));
        
        
        
    }
}

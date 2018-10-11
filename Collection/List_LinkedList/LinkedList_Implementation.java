/*
 *  Copyright Subhro Chatterjee
 */

package List_LinkedList;

import java.util.LinkedList;

/**
 * @author subhro
 */

public class LinkedList_Implementation {

    public static void main(String... array){
        
        LinkedList<String> linkedlist =  new LinkedList<>();
        linkedlist.add("D");
        linkedlist.add("A");
        linkedlist.add("B");
        linkedlist.add("C");
        linkedlist.add("A");
        linkedlist.add("D");
        linkedlist.add("E");
        linkedlist.add("D");
        linkedlist.add("F");
        
        System.out.println("Contentx in LinkedList :: "+linkedlist);
        
        linkedlist.remove("B");
        linkedlist.remove();
        linkedlist.remove(2);
        linkedlist.removeFirst();
        linkedlist.removeFirstOccurrence("A");
        linkedlist.removeLast();
        linkedlist.removeLastOccurrence("D");
        
        System.out.println("After : " + linkedlist);
        
        if(linkedlist.contains("E"))   System.out.println("Contains E");
        else    System.out.println("Does not contains");
        
        System.out.println("Size of the LinkedList " +linkedlist.size());
    }
}

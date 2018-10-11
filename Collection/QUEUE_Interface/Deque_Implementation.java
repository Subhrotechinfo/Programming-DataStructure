/*
 *  Copyright Subhro Chatterjee
 */

package QUEUE_Interface;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author subhro
 */

public class Deque_Implementation {

    public static void main(String... array){
        
        Deque<Integer> deque = new LinkedList<>();
        deque.add(10);
        deque.add(59);
        deque.add(2);
        deque.add(45);
        deque.add(9);
        deque.add(7);
        
        //reverse order
        Iterator reverseitr = deque.descendingIterator();
        while(reverseitr.hasNext()){
            System.out.print(reverseitr.next());
        }
        
        
        
        
    }
}

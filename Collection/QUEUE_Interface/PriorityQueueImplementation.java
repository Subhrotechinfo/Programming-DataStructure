/*
 *  Copyright Subhro Chatterjee
 */

package QUEUE_Interface;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * @author subhro
 */

public class PriorityQueueImplementation {
    
    public static void main(String... array){
        
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.add(25);
        pQueue.add(89);
        pQueue.add(46);
        pQueue.add(19);
        pQueue.add(72);
        System.out.println("Iterating through : ");
        Iterator itr = pQueue.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        
        System.out.println("\nPrinting in foreach");
        //Objects of Queue to an Array
        Object[] arr = pQueue.toArray();
        for(Object ele : arr)
            System.out.print(ele+" ");
    }
}
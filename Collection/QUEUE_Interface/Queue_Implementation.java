/*
 *  Copyright Subhro Chatterjee
 */

package QUEUE_Interface;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author subhro
 */

public class Queue_Implementation {
    
     
    public static void main(String... array){
        
        Queue<Integer> queuey =  new LinkedList<>(Arrays.asList(new Integer[]{1,2,6,5,4,7,8,9}));
        
        System.out.println("Elements : "+queuey);
        System.out.println("Removing : "+queuey.remove());
        System.out.println("Peek element : "+ queuey.peek());
    }

}

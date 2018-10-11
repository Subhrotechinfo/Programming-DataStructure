/*
 *  Copyright Subhro Chatterjee
 */

package Queue_Implementation;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author subhr
 */

public class LinkedListQueue<D> {
    
    LinkedList<D> queue ;
    //constructor
    public LinkedListQueue(){
        queue =  new LinkedList();
    }
    
    
    //Is our queue empty
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    //What is the size of our queue
    public int size(){
        return queue.size();
    }
    
    //Enqueueing an item
    public void enqueue(D n){
        queue.addLast(n);
    }
    
    //Dequeueing an item
    public D dequeue(){
        return queue.remove(0);
    }
    
    //Peek at the first item
    public D peek(){
        return  queue.get(0);
    }
    
    //toString
    @Override
    public String toString (){
        return (queue+" ");
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedListQueue genericQueue = new LinkedListQueue();
        genericQueue.enqueue(5);
        genericQueue.enqueue(7);
        genericQueue.enqueue(6);
        
        System.out.println("Numbers in the Queue "+ genericQueue.toString());
        System.out.println("Peek element in the Queue: "+genericQueue.peek());
        System.out.println("First number Dequeued : "+genericQueue.dequeue());
        
    }

}

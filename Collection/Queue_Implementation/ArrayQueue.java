/*
 *  Copyright Subhro Chatterjee
 */

package Queue_Implementation;

import java.util.NoSuchElementException;

/**
 * @author subhr
 */

public class ArrayQueue {
    
         protected int Queue[];
     protected int front , rear, capacity , size;
     
     //Constructor
     public ArrayQueue(int capacity){
         this.capacity = capacity;
         front = -1;
         rear = -1;
         size = 0;
         Queue = new int[capacity];
         
     }
     public int size(){
         return size; 
     }
     
     //isEmpty
     public boolean isEmpty(){
         if(size == 0 )
            return true;
         return false;
     }
     
    //IsFull
     public boolean isFull(){
         if(size == capacity)
             return true;
         return false;
     }
     
     //Insert
     public void enqueue(int ele){
         
         if(rear == -1){
             front = 0;
             rear = 0;
             Queue[rear] = ele;
         }
         else if(rear  >= size )
             throw new ArrayIndexOutOfBoundsException("Over Flow Exception");
         else if(rear+1 <= size)
             Queue[++rear]=ele;
             
         size++ ;
     }
     
     //Delete
     public int dequeue(){
         if(front == -1 && rear == -1)
             throw new NoSuchElementException("Under Flow Exception");
         else{
             size--;
             int ele = Queue[front];
             if(front == rear){
                 front = -1;
                 rear=   -1;
             }else
                 front++ ;
              return ele;
         }
         
     }
     
     public void display(){
         System.out.print("Printing elements in Queue");
         if(size() ==0){
             System.out.println("Queue is empty");
         return ;
         }
         for(int index = front ; index <= rear; index++)
             System.out.print(Queue[index]+" ");
         System.out.println();
     }
     
     public static void main(String[] args) {
    
         ArrayQueue qu=new ArrayQueue(5);
         qu.enqueue(2);
         qu.enqueue(4);
         qu.enqueue(9);
         qu.enqueue(7);
         qu.enqueue(6);
         
         qu.display();
         
         System.out.println(" Dequeue Element : "+qu.dequeue());
         System.out.println(" Dequeue Element : "+qu.dequeue());
         qu.display();
         //System.out.println(qu.isEmpty());
         //System.out.println(qu.isFull());
     
     }
}
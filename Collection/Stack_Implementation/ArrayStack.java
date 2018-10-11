/*
 *  Copyright Subhro Chatterjee
 */

package Stack_Implementation;

import java.util.NoSuchElementException;
import static javafx.beans.binding.Bindings.isEmpty;

/**
 * @author subhro
 */

public class ArrayStack {

    protected int arr[];
    protected int top , size , capacity;
    
    public ArrayStack(int capacity){
        //Constructor
        this.capacity = capacity;
        size=0;
        arr = new int[capacity];
        top = -1;
    }
    
    public boolean isEmpty(){
        if(top == -1)
        return true;
      return false;  
    }
    
    public boolean isFull(){
        return top == size-1;
    }
    
    public int getSize(){
        return size;
    }
    
    public int peek(){
         if(isEmpty())   throw new NoSuchElementException("Underflow Exception");
       return arr[top];
    }
    
    public void push(int ele){
        if(top+1 > capacity)      
            throw new IndexOutOfBoundsException("Overflow Exception");
        if(top+1 < capacity)
            arr[++top] = ele;
        size++;
    }
    
    public int pop(){
        if(isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        size--;
        return arr[top--];
    }
    
    public void display(){
        System.out.println("\n Stack ");
        
        if(getSize() == 0){
            System.out.println("Empty");    return;
        }
        for(int index = top ; index >= 0 ; index--)
            System.out.println(arr[index]+" ");
        System.out.println();
    }
    
    public static void main(String... array){
        
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.push(10);
        arrayStack.push(15);
        arrayStack.push(45);
        arrayStack.push(89);
        arrayStack.push(69);
        arrayStack.push(43);
        
        arrayStack.display();
        
        System.out.println("Popped elements are: "+arrayStack.pop());
        System.out.println("Popped elements are: "+arrayStack.pop());
        
        System.out.println("Top element after pop : "+arrayStack.peek());
        
        arrayStack.display();
    }
    
}

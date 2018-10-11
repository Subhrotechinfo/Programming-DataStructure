/*
 *  Copyright Subhro Chatterjee
 */

package Stack_Implementation;

import java.util.NoSuchElementException;

/**
 * @author subhr
 */

public class ArrayStackObjectVersion {

    protected Object arr[];
    protected int top , size , capacity;
    
    public ArrayStackObjectVersion(int capacity){
        //Constructor
        this.capacity = capacity;
        size=0;
        arr = new Object[capacity];
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
    
    public Object peek(){
         if(isEmpty())   throw new NoSuchElementException("Underflow Exception");
       return arr[top];
    }
    
    public void push(Object ele){
        if(top+1 > capacity)      
            throw new IndexOutOfBoundsException("Overflow Exception");
        if(top+1 < capacity)
            arr[++top] = ele;
        size++;
    }
    
    public Object pop(){
        if(isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        size--;
        return arr[top--];
    }
    
    public void display(){
        System.out.println("\n Stack Elements : ");
        
        if(getSize() == 0){
            System.out.println(" Empty ");    return ;
        }
        for(int index = top ; index >= 0 ; index--)
              System.out.println(arr[index]+" ");
        System.out.println();
    }
    
    public static void main(String... array){
        
        ArrayStackObjectVersion arrayStack = new ArrayStackObjectVersion(10);
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
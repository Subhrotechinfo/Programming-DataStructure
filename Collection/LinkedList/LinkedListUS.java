/*
 *  Copyright Subhro Chatterjee
 */

package LinkedList;

import java.util.LinkedList;

/**
 * @author subhr
 */

public class LinkedListUS<D> {
    
    //Properties
    Node<D> head;
    int count ;
    
    //Constructors
    
//    public LinkedListUS(){
//        head=null;
//        count=0;
//    }
    
    public LinkedListUS(Node<D> newHead){
        head=newHead;
        count=1;
    }
    
    //Methods
    
    //get 
    public D get(int index){
        
        Node<D> current =head;
        
        if(index >= size())
            throw new ArrayIndexOutOfBoundsException("Index is out of bound");
//        if(index<0)
//            return -1;
        
      for(int i=0;i<index;i++){
          current=current.getNext();
      }
      return current.getData();
      
    }
    
    //size
    public int size(){
        return count;
    }
    
    //isEmpty
    public boolean isEmpty(){
        return head == null;
    }

    
    
    //add at last of the list
    public void addAtLast(D newData){
        Node<D> temp= new Node(newData);
        Node<D> current = head;
        while (current.getNext()!=null){
            
            //iterating through the list
            current=current.getNext();
        }
        current.setNext(temp);
        count++;
    }
    
    //adding at the beginning 
    public void addAtFront(D newData){
        
        Node<D> temp =  new Node<D>(newData);
        Node<D> current=head;
         
          if(current == null){
               head=temp;
               count++;
               
          }else{
               temp.setNext(head);
               head=temp;
               count++;
          }
    }
    
    //insert at index
    public void AddAtIndex(D newData,int position){
        Node<D> temp= new Node(newData);
        Node<D> current=head ; 
        if(current !=null){
            for(int i=0; i < position && current.getNext() !=null ; i++){
                current=current.getNext();
            }
        }
         temp.setNext(current.getNext());  
         current.setNext(temp);
         count++;
    }
    
    //remove from the last
    public void removeEnd(){
    
        //remove from the back of the list
        Node<D> current = head;
        while(current.getNext().getNext()!=null){
            current=current.getNext();
        }
        current.setNext(null);
        count--;
    }
    
    //remove from beginning
    public void removeFromBegin(){
        Node<D> current  =head;
        
        if(current.getNext() == null){
              head=null;
              count--;
             throw new ArrayIndexOutOfBoundsException("There is no element in the list");
              
        }
        if(current.getNext()!=null){
            head=current.getNext();
            count --;
        }
        
    }
    
    //remove from specific position
    public void removeAtPosition(int position){
        Node<D> current=head;
        if(position < 1 || position > size()){
            throw new ArrayIndexOutOfBoundsException("Kindly specify within the index");
        }
//        if(current.getNext().getNext() == null){
//                    head=current;
//                    count --;
//          }
        if(head != null && current.getNext() != null){
            for(int i=0 ; i < position-1 ; i++){
                current=current.getNext();
            }
            current.setNext(current.getNext().getNext());
            count--;
        }
    }
    
     
    public String toString(){
        Node<D> current = head;
        
        StringBuilder sb =  new StringBuilder();
        
        if(current.getNext() == null )   return "[]";
        
        else{
            //append the first element
            current=current.getNext();
            sb.append("["+current.getData());
            
            while(current.getNext()!=null){
                sb.append(","+current.getData());
                current = current.getNext();
            }
            sb.append("]");
        }
        return sb.toString();
    }
    
    public static void main(String[] args) {
        
        LinkedListUS<String> list = new LinkedListUS<String>(new Node("Firsty"));
        list.addAtLast("Subhro");
        list.addAtLast("PDF");
        list.addAtLast("AWA");
        list.addAtLast("Alice");
       // System.out.println(list.get(2));
        //System.out.println("Front add");
        //list.addAtFront(10);
        //list.AddAtIndex(15, 3);
        //list.removeFromBegin();
       // list.removeAtPosition(2);
        System.out.println(list.toString());
         
    }

}
/*  
 *  Copyright Subhro Chatterjee
 */

package LinkedList;

/**
 * @author subhro
 */
//Generic Version
public class Node<D> {
    
    Node<D> next;
    D data;
    
    //1 Parameter Constructor for creating new node
    public Node(D newData){
        this.data = newData;
        next=null;
    }
    //2 Parameter Constructor
    public Node(D newData,Node<D> newNext){
        this.data=newData;
        next=newNext;
    }
    
    //Getters and Setters
    public D getData(){
        return data;
    }
    public Node<D> getNext(){
        return next;
    }
    public void setData(D newData){
        this.data=newData;
    }
    
    public void setNext(Node<D> newNext){
        next= newNext;
    }

}
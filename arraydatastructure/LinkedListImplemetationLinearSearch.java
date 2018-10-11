package arraydatastructure;
public class LinkedListImplemetationLinearSearch {
 Node head;
 int count;
    
    LinkedListImplemetationLinearSearch(){
        head=null;
        count=0;
    }
    LinkedListImplemetationLinearSearch(Node newData){
        head=newData;
        count=1;
    }
    
    public int size(){
        return count;
    }
    public boolean isEmpty(){
        return head==null;
    }
    
    public int get(int index){
        
        Node current=head;
        if(index<0)
           return -1;
        else if(index>=size())
            throw new ArrayIndexOutOfBoundsException("Index is out of bound");
        else
            for(int i=0;i<index;i++){
                current=current.getNext();
            }
        return current.getData();
    }
    
    public void addLast(int newData){
        Node temp= new Node(newData);
        Node current = head;
        while(current.getNext()!=null){
            current=current.getNext();
        }
        current.setNext(temp);
        count++;
    }
    
    public int linearSearch(int target){
        Node current=head;
        if(head!=null){
            while(current.getNext()!=null){
                if(current.getData() == target)
                    return 1;
                current=current.getNext();
            }
        }
        return -1;
    }
      public static void main(String args[]){
        
         LinkedListImplemetationLinearSearch list = new LinkedListImplemetationLinearSearch(new Node(2));
         list.addLast(5);
         list.addLast(15);
         list.addLast(3);
         int found=list.linearSearch(15);
         System.out.println(list.get(2));
         System.out.println(found);
    }
    
}

class Node{
    Node next;//reference
    int data;
    Node(int data){
        this.data=data;
        next=null;
    }
    Node(int newData,Node newNext){
        
        this.data=newData;
        next=newNext;
    }
    //getters and setters
    public int getData(){
        return data;
    }
    public Node getNext(){
        return next;
    }
    public void SetData(int newData){
        this.data=newData;
    }
    public void setNext(Node newNext){
        next=newNext;
    }
} 

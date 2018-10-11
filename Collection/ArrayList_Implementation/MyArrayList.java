/*
 *  Copyright Subhro Chatterjee
 */

package ArrayList_Implementation;

/**
 * @author subhro
 */

public class MyArrayList {
    private static final int SIZE_FACTOR = 5;
    private Object arr[];
    private int index;
    private int size;
    
    public MyArrayList(){
        this(10);
    }
    public MyArrayList(int cap){
        arr = new Object[cap];
    }
    public int size(){  return index;    }
    
    public Object get(int position) throws Exception{
        if(position < size())
            return arr[position];
        else    throw new ArrayIndexOutOfBoundsException("No such element");
        
    }
    
    public void add(Object ele){
      if(arr.length-index <= 5)
          increase();
      arr[index++] = ele; 
    }
    
    public void increase(){
        Object temp[]  = new Object[arr.length+SIZE_FACTOR];
        
        for(int i = 0 ;i < arr.length; i++ )
            temp[i] = arr[i];
        
        arr=temp;
    }
    
    public Object remove(int position) throws Exception{
        
        if(position > size() ) throw new ArrayIndexOutOfBoundsException("Index out of bound");
        Object obj = arr[position];
        if(position < size()){
            
            int temp = position;
            arr[position] = null;
            while(temp < size()){
                arr[temp]  = arr[temp+1];
                arr[temp+1] = null;
                temp++;
            }
        }
        index--;
        return obj;
    }
    
    public String toString(){
        if(size() == 0)         return "[]";
        
        String str = "[ " + arr[0];
        
        for(int i = 1 ; i< arr.length ; i++)
            if(arr[i]!= null)
            str+=" , "+arr[i];
        
        str+=" ]";
        return str;
    }
    
    public static void main(String...  array) throws Exception{
        
        MyArrayList myarraylist = new MyArrayList();
        
        myarraylist.add(5);
        myarraylist.add(48);
        myarraylist.add(56);
        myarraylist.add(75);
        myarraylist.add(98);
        System.out.println(myarraylist.toString());
        System.out.println(myarraylist.get(2));
        System.out.println("Size "+myarraylist.size());
        System.out.println("Removed element : "+myarraylist.remove(2));
        System.out.println(myarraylist.toString()); 
        
    }
}
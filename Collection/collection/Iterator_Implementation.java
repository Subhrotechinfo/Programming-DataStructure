/*
 *  Copyright Subhro Chatterjee
 */

package collection;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author subhro
 */

//Applicable to any Collection Object --> Both read & remove

public class Iterator_Implementation {

    public static void main(String args[]){
        
        ArrayList<Object> arrayList =  new ArrayList<>();
        for(int index = 0 ; index < 10 ; index ++)
            arrayList.add(index);
        
        System.out.println(arrayList);
        
        //Iterator itr = arrayList.iterator();
        
//        while(itr.hasNext()){   //Checking the next element
//            
//            int i = (Integer)itr.next();    // moving cursor to the next
//            System.out.print(i+ " ");
//            if(i%2  != 0 )
//                itr.remove();
//        }
        
        while(arrayList.iterator().hasNext()){
            
          int ele = (Integer)arrayList.iterator().next();
          //  int ele =(int) arrayList.iterator().next();
          
          System.out.println(ele);
          
          if(ele%2 !=0)
              arrayList.iterator().remove();
        }
        
        System.out.println();
        System.out.println(arrayList);
    }
}
/*
 *  Copyright Subhro Chatterjee
 */

package Stack;

import java.util.Stack;

/**
 * @author subhro
 */

public class Stack_Implementation {

    public static void main(String... array){
        
        Stack stacky = new Stack();
        for(int index = 0 ; index < 5 ; index++)
        stacky.push(index);
        
        stacky.pop();
        System.out.println(stacky.toString());
        
        //returns the element if not found returns -1
        System.out.println(stacky.search(2));        
    }
}
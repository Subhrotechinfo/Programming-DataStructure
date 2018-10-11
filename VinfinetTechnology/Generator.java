/*
 *  Copyright Subhro Chatterjee
 */

package vinfinettechnology;

import java.util.Random;

/**
 * @author subhro
 */

public class Generator {
    
    public static void main(String... arrays ){
        
        Random rand = new Random();
        long num  = rand.nextInt(1000000);
        
        
        System.out.println(num);
        
        
    }
    

}

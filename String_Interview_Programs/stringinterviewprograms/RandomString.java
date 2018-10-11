/*
 *  Copyright Subhro Chatterjee
 */

package stringinterviewprograms;

import static java.lang.System.in;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import org.apache.commons.lang3.RandomStringUtils;

/**
 * @author subhro
 */

public class RandomString {
    public static void main(String... array){
        //randomStringApproach1();
        randomStringApproach2(5);
        //randomStringApproach3(6);
        //randomStringApproach4();
        randomStringApproach5();
    }
    
    public static void randomStringApproach2(int length){
        
        char []ch = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 
        'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
        'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
        'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
        'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
        'w', 'x', 'y', 'z'};
        
        //char[] c = new char[length];
        String nstr = "";
        Random random = new Random();
        for(int index = 0  ; index < length ; index++)
            nstr+= ch[random.nextInt(ch.length)];
         
        System.out.println(nstr);
    }
    
    public static void randomStringApproach3(int len){        
        char ch[] = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
                                                .toCharArray();        
        char[] nchar = new char[len];        
        SecureRandom random = new SecureRandom();
        for(int index = 0 ; index < len ; index++ )
            nchar[index] = ch[random.nextInt(ch.length)];        
        System.out.println(Arrays.toString(nchar));
    }
    
    public static void randomStringApproach4(){
        //immutable Universally Unique Identifier
        UUID uuid =  UUID.randomUUID();
        String str = uuid.toString().replace("-","");
        System.out.println( " UUID : " + str ); //32 length
    }
    
    public static void randomStringApproach5(){
        Random random = new Random ();
        int low = 65,high = 90  ;
           //A-Z
           int rand =  random.nextInt(high-low)+low;
           System.out.println("Random A-Z : "+(char)rand);
           
           //a-z
           int a =97, z =122;
           rand = random.nextInt(z-a)+a;
           System.out.println("Random a-z : "+(char)rand);
           
           //special character
           int sp1 = 33 , sp2 = 47;
           rand = random.nextInt(sp2-sp1)+sp1;
           System.out.println(" Special Characters : "+(char)rand);
           
           int zero = 48 , nine = 57;
           rand = random.nextInt( nine - zero ) + zero;
           System.out.println("Random digits : " + (char)rand);
           
           
           char c='$';
           System.out.println(" Converting '" + c + "' to ASCII value "+(int)c);
    }
    
    public static void randomStringApproach1(){
        
        //alpha-numeric String             random(count , letter , number)  
        String str = RandomStringUtils.random(1, false, true);
        System.out.println(" Random 1 : " + str );
        
        //alphabetic String
        str=RandomStringUtils.randomAlphabetic(1);
        System.out.println(" Random 2 : " + str );
        
//        Characters will be chosen from the set of characters whose
//     * ASCII value is between <code>32</code> and <code>126</code> (inclusive).
//        
        str=RandomStringUtils.randomAscii(1);
        System.out.println(" Random 3 : "+str );
        
        str=RandomStringUtils.random(5, 0, 10, true, true, "bj81G5RDED3DC6142kasok".toCharArray());
        System.out.println("Random 4: "+str );
        
    }
}
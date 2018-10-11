/*
 *  Copyright Subhro Chatterjee
 */

package stringinterviewprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author subhro
 */
//Regular Expression
public class StringRegex {
    public static void main(String... array){
        
        //String str = "dfhjbdhbhfdb@#$$%^123477";
        System.out.println(Pattern.matches("geeksforg*ek", "geekforgeek"));  
        System.out.println(Pattern.matches("geeks", "geeks"));
        
        Pattern pattern = Pattern.compile("geeks");
        Matcher m =  pattern.matcher("geeksforgeeks");
        
        while(m.find()){
            System.out.println(" Pattern 1 found from "+m.start()+" to "+ (m.end()-1));
        }
        
        Pattern pattern1 = Pattern.compile("ge*");
        Matcher m1 = pattern1.matcher("geeksforgeeks.org");
        
        while(m1.find()){
            System.out.println("Pattern 2 found from "+ m1.start()+" to "+(m1.end()-1));
        }
        
        Pattern pattern2 = Pattern.compile("ge*",Pattern.CASE_INSENSITIVE);
        Matcher m2 = pattern2.matcher("GeeksforGeek.org");
        
        while(m2.find()){
            System.out.println(" Pattern found from " + m2.start() + " to " +( m2.end()-1 ) );
        }
        
        String test = "geeks1for2geeks3";
        
        String delimiter = "\\d";   //digits 
        
        Pattern pattern3 = Pattern.compile(delimiter,Pattern.CASE_INSENSITIVE);
        
        String[] result =  pattern3.split(test);
        for(String s: result)
            System.out.println(s);
        
        Pattern number = Pattern.compile("\\d");
        Matcher m3 = number.matcher("geeks123for2geeks3");
        //Pattern number1 = Pattern.compile("\\d{6}");
        //System.out.println("Numbers"+m3.matches());
        while(m3.find()){
            System.out.println("Numbers found : "+ m3.start()+" to " + (m3.end()-1)   );
        }
        
    }
}
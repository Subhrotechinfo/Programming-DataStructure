/*
 *  Copyright Subhro Chatterjee
 */
package stringinterviewprograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author subhro
 */
public class CountVowelsConstants {

    public static void main(String... array) {

        //using regex
        String test = "Th9#6is string contains numbers@#4569#62$%123549";
        int vowel = 0, constant = 0;
        Pattern vowelP = Pattern.compile("[aieouy]", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matchV = vowelP.matcher(test);
        while (matchV.find()) {
            ++vowel;
        }
        Pattern constantP = Pattern.compile("[bcdfghjklmnpqrstvwx]", Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE);
        Matcher matchC = constantP.matcher(test);
        while (matchC.find()) {
            ++constant;
        }
        System.out.println("Vowel count : " + vowel + " constant : " + constant);

        //Naive 
        String test2 = "thisdhWWbh$$awbibsb#$#" ;
        int v = 0, c = 0;
        //System.out.println("original length : "+test2.length());
        //Pattern pat = Pattern.compile("[a-zA-Z]",Pattern.CASE_INSENSITIVE|Pattern.UNICODE_CASE);
        //if (pat.matcher(test2).matches()) {
            for (int index = 0; index < test2.length(); index++) {
                char ch = test2.charAt(index);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y') {
                    v++;
                } else if(((int)ch) > 65 && ((int)ch) < 90 || ((int)ch) > 97 && ((int)ch) < 122) {
                    c++;
                    System.out.println("constant");
                }
            }
            System.out.println(" V: " + v + " C: " + c);
        //} else {
          //  System.out.println("Enter alpha-numeric characters only ");
        //}
    }
}


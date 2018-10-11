/*
 *  Copyright Subhro Chatterjee
 */
package stringinterviewprograms;
/**
 * @author subhr
 */
public class StringtoInt {

    public static void main(String... array){        
        String str = "45697";
        System.out.println((Integer.valueOf(str)));
        
        String in = "";
        System.out.println( (in+123) instanceof String  );
        String sb = new StringBuilder().append("").append(10).toString();
        System.out.println(" Using String Builder : "+sb.toString());
        
        //Integer.valueOf(str);
       // Character.valueOf('5');
//        Double.valueOf("sss569hsh");
//        Float.valueOf(str);
//        Byte.valueOf(str);
    }
}


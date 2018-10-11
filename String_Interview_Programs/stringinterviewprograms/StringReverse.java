/*
 *  Copyright Subhro Chatterjee
 */
package stringinterviewprograms;
/**
 * @author subhro
 */
public class StringReverse {

    public static void main(String... array){
        
        //using reverse()
        String rev = new StringBuilder("Subhro chatterjee").reverse().toString();
        System.out.println("Using String Builder : "+rev);
        
        //using iterative way
        rev=reverseString("geeks for geek");
        System.out.println("Using iterative way: "+ rev);
        
        //using recursion
        String s = "Strings are awasome";
        System.out.print("Using recursion Approach 1 : ");
        reverse(s);
        
        rev = reverseStringApproach3("String reverse approach");
        System.out.print("Using recursion Approach 2 : ");
        System.out.println(rev);
        
    }
    
    public static String reverseString(String str){
        //iterative way
        char[] arr = str.toCharArray();
        StringBuilder sb =  new StringBuilder();
        for(int index = arr.length-1 ; index >= 0 ; index-- )
                sb.append(arr[index]);
        return sb.toString();
    }
    
    public static void reverse(String str){
        //recursion approach 1
        if( (str == null)||(str.length() <= 1) ){
            System.out.println(str);
        }else{
            System.out.print( str.charAt(str.length()-1));
            reverse( str.substring( 0 , str.length()-1 ) );
        }
    }
    
    public static String reverseStringApproach3(String str){
        //recursion approach 2
        if(str.isEmpty())   
            return str;
        return reverseStringApproach3( str.substring(1) ) +  str.charAt(0) ;
    }
}
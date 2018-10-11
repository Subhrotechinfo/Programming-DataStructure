/*
 *  Copyright Subhro Chatterjee
 */
package stringinterviewprograms;
import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Pattern;
/**
 * @author subhro
 */
public class SortString_Length {

    private static void sortStringLength(String[] strarr , int n ){
        String key;
        int i=0;
        for(int j = 0 ; j < n ; j++ ){            
            key = strarr[j];
            i=j-1;
            
            while(i >=0 && key.length() < strarr[i].length()){
                strarr[i+1] = strarr[i];
                i=i-1;
            }
            strarr[i+1] = key;
        }
        System.out.print(Arrays.toString(strarr));
    }
    
    public static void sortStringLength2(){    
        String str = "No one could disentangle correctly";
        Pattern pattern = Pattern.compile("\\s");
        String [] arr = pattern.split(str);
         
        Arrays.sort( arr , new  Comparator<String>(){
            @Override
            public int compare(String s1,String s2){
                return s1.length()-s2.length();
        }
    });
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String... array){
        String[] arr = new String[]{"subhro","Chatterjee","name","my"};
        sortStringLength(arr , arr.length );
        sortStringLength2();
    }
}

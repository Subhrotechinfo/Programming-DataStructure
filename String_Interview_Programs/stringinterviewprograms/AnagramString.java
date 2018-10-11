/*
 *  Copyright Subhro Chatterjee
 */
package stringinterviewprograms;
import java.util.Arrays;
import java.util.HashMap;
/**
 * @author subhro
 */
public class AnagramString {

      public static void anagramStringApproach1(String s1,String s2){
          //convert to character array -  sort array -  compare using equals()
          
          String str1 = s1.replace("\\s","").toLowerCase();   //remove all white spaces
          String str2 = s2.replace("\\s","").toLowerCase();
          
          boolean status =true;
          
          if(str1.length() != str2.length())
              status = false;
          else{
              char[] arr1 = str1.toCharArray();
              char[] arr2 = str2.toCharArray();
              
              //sort them
              Arrays.sort(arr1);
              Arrays.sort(arr2);
              
              status = Arrays.equals(arr1, arr2);
          } //End else
          if(status)    System.out.println(str1+" and "+str2+" are ANAGRAM.");
          else          System.out.println(str1+" and "+str2+" are NOT ANAGRAM.");
      }      

      public static void anagramStringApproach2(String s1,String s2){
          
          //using hashmap
          String str1 = s1.replaceAll("\\s", "").toLowerCase();
          String str2 = s2.replaceAll("\\s", "").toLowerCase();
          
          boolean status = true;
          
          if(str1.length() != str2.length()){
              status = false;
          }else{
              
              HashMap<Character,Integer> map = new HashMap<>();
              
              for(int i = 0; i < str1.length(); i++){
                  char charAsKey = str1.charAt(i);
                  int charCount= 0;
                  
                  if(map.containsKey(charAsKey)){
                      charCount = map.get(charAsKey);
                  }
                  
                  map.put(charAsKey, ++charCount);
                  
                  // Second part
                  charAsKey = str2.charAt(i);
                  charCount = 0;
                  if(map.containsKey(charAsKey))
                      charCount = map.get(charAsKey);
                  
                  map.put(charAsKey, --charCount);
              }
              
              for(int value : map.values()){
                  if(value != 0)
                      status =false;
              }
          }//end else
          
          if(status)        System.out.println(str1 + " and "+ str2+ " are ANAGRAM.");
          else              System.out.println(str1+ " and "+ str2+" are NOT ANAGRAM");    
      }
      
      public static void main(String... array){
          anagramStringApproach2("Mother In Law", "Hitler Woman");
          anagramStringApproach1("keEp", "peeK");
          anagramStringApproach2("Toss", "Shot");
          anagramStringApproach2("joy", "enjoy");
      }
}
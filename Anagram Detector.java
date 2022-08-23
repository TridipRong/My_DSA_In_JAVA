import java.util.*;
class Main{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        String str1=input.nextLine();
        String str2=input.nextLine();
         str2=str2.replaceAll("\\s", "");
         str1=str1.replaceAll("\\s", "");
        if(str1.length()==str2.length()){
            char[] ArrayS1 = str1.toLowerCase().toCharArray();  
            char[] ArrayS2 = str2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            if( Arrays.equals(ArrayS1, ArrayS2)){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }
        }
        else{
            System.out.println("False");
        }
       
	}
}



//An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. For example, the word anagram can be rearranged into nag a ram.

//Given 2 phrases, write a program that detects if both are anagrams of each other.

//If both are anagrams, print "True"

//Else print "False"
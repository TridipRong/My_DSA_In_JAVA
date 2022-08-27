import java.io.*;
import java.util.*;
import java.lang.*;

class Main
{
public static void reduceString(StringBuilder sb)
{
    int i=0;
    
    while(i<sb.length()-1){
        if(sb.charAt(i) == sb.charAt(i+1)){
            sb.delete(i,i+2);
            i=0;
        }
        else{
            i+=1;
        }
    }
    if(sb.length()==0)
        System.out.println("Empty String");
    else
        System.out.println(sb.toString());
}
public static void main(String[] args)
{
	Scanner input=new Scanner (System.in);
	StringBuilder sb=new StringBuilder(input.nextLine());
	
	reduceString(sb);
}
}


///Given a string of lowercase characters in range ascii[‘a’..’z’].

//You can perform one operation on this string in which you can selects a pair of adjacent lowercase letters that match, and delete them.

//For instance, the string aab could be shortened to b in one operation.

//Your task is to delete as many characters as possible using this method and print the resulting string. If the final string is empty, print "Empty String" (without quotes).

//Please note that characters can be deleted only if they form a pair and are same(i.e from aaa we can only delete 2 a's and will be left with a single a).

//I know there exists a simple implemented Stringentation based solution of this question, but please try to come up with an approach that uses stack data structure to solve the purpose
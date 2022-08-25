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

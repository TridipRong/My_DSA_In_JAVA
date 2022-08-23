import java.util.*;
class Main{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        int c=0;
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    c++;
                }
            }
        }
        System.out.println(c);
	}
}

//Given a string S, you need to find the count of all contiguous substrings starting and ending with same character.
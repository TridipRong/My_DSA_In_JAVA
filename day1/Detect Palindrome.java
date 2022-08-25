import java.util.*;
class Main{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int p=input.nextInt();
        int s=0,remainder;
        int num=p;
        while (p!=0) {
          remainder=p% 10;
          s=s*10+remainder;
          p=p/10;
        }
        if(num==s){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
	}
}


//Given an integer, print "Yes" (without quotes) if that integer is aPalindrome, else print "No" (without quotes)

//You must write a recursive function to achieve this

//You must not use the reverse() function. Using that would lead to disqualification
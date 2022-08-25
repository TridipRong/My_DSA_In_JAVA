import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        StringBuilder s = new StringBuilder();
        s.append(input.next());
        s.reverse();
        //System.out.println(str);
      if(s.length()%2 == 0){
            String  p = s.substring(0,s.length()/2);
            
            String  q = s.substring((s.length()/2),(s.length()));
            System.out.print(q);
            System.out.print(p);
      } else{
            String  p = s.substring(0,((s.length()/2)));
            
            String  q = s.substring(((s.length()/2)+1),(s.length()));
            System.out.print(q);
            System.out.print(s.substring(((s.length()/2)),((s.length()/2)+1)));
            System.out.print(p);
      }
      
    }
}


//You are given a string S. Cut it into 2 equal halves and reverse it.

//So, suppose if you have a string "abcxyz" then after performing the above mentioned operation it becomes "cbazyx"

//If you have a string "abcdxyz", then after performing the above mentioned operation it becomes "cbadzyx"
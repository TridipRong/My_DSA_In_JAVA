import java.util.*;
public class Main{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int p=sc.nextInt();
    String str=sc.next();
    int i = 0, n = str.length();
    char[] ans = str.toCharArray();
        for (int j = 0; j < n; ++j, ++i) {
            ans[i] = ans[j];
            if (i > 0 && ans[i - 1] == ans[i])
                i -= 2;
        }
        if((new String(ans, 0, i)).length()>0){
            System.out.println(new String(ans, 0, i));
        }else{
            System.out.println(-1);
        }
    }
}


//Minions are of 26 types, from 'a' to 'z'. If two Minions of same type finds themselves besides each other, they will kill each other.

//You are given a string of Minions. You need to find the final surviving string of Minions, after all the killings. i.e Further No Minion will kill other Minion.

If no Minion survived a after all the fighting, print "-1".
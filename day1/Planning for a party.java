import java.util.*;
import java.io.*;
import java.util.stream.*;
import static java.util.stream.Collectors.*;

class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = Stream.of(br.readLine().trim().split(" ")).map(i->{
            return Integer.parseInt(i);
            }).collect(Collectors.toSet());  
            
        int n2 = Integer.parseInt(br.readLine());
        Set<Integer> set2 = Stream.of(br.readLine().trim().split(" ")).map(i->{
            return Integer.parseInt(i);
            }).collect(Collectors.toSet());  
            
        if(!set.equals(set2)){
            System.out.print("No");
        }else{
            System.out.print("Yes");
        }
        
    }
}


//Jim and Pam are inviting friends for a party. But, they want to invite only those friends who have helped them in any way. So, they have made two arrays, indicating the number of people they have taken help from. Each person, has been assigned a unique ID, in the form of a number.

//Both, Jim and Pam make their separate invite listAandBbased on the number of people, they have taken help from. Find out if the lists created by the two of them are same or not.

//Note: A person might have helped them multiple times, and obviously would be invited only once
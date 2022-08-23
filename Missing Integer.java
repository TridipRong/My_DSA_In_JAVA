import java.util.*;
class Main{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        String[] str=input.nextLine().split(" ");
        
        int[] arr=new int[str.length];
        int sum=0;
        for(int i=0;i<str.length;i++){
            arr[i]=Integer.parseInt(str[i]);
            sum+=arr[i];
        }
        int n=arr.length+1;
        int sum2=(n*(n+1))/2;
        System.out.println(sum2-sum);
	}
}


//You are given an array of N-1 integers and integers are in the range of 1 to N. There are no duplicates in the array. One of the integers is missing in the array. Find the missing integer
import java.util.*;
class Main{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        for(int i=0;i<t;i++){
            int n=input.nextInt();
            int sum=0;
            StringBuilder ans=new StringBuilder();
            for(int j=0;j<n;j++){
                sum+=input.nextInt();
                ans.append(Integer.toString(sum)+" ");
            }
            System.out.println(ans);
        }
	}
}

//You are given an arrayAcontaining N integers, find the running sum of the array.

//The running sum of the array is defined as the sum of all the elements of the array that exists before the current element, including the current element

//Refer the sample I/O for better understanding
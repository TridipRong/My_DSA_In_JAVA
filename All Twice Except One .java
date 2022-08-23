import java.util.*;
class Main{
    public static void main(String arg[]){
        
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        for(int i=0;i<t;i++){
            int n=input.nextInt();
            int N=(2*n)-1;
            int sum=0;
            int[] arr=new int[N];
            for(int j=0;j<N;j++){
                arr[j]=input.nextInt();
               
            }
            int res=arr[0];
            for (int p=1; p<N; p++)
            res = res ^ arr[p];
            
            System.out.println(res);
        }
	}
}


//You are given a numberN, and an array such that the array contains all the numbers from 1 to N including N twice, except for one, which is present only once

//You have to find the number which is present only once, in the array


//Input
//The first line of the input containsT, the number of test cases

//The first line of each test case, containsN, the value as explained in the problem statement

//The next line contains2*N - 1, the number of elements in the array
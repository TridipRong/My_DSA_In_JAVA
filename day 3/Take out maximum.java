import java.util.*;
class Main{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        takeOutMax(n,k,arr);
	}
	public static void takeOutMax(int n,int k,int[] arr){
	    int res=0;
    	    
        for(int j=0;j<k;j++)
        {
            res=res+arr[j];
            
        }
        
        int maxm=res;
        int maxsum=0;
        for(int i=k;i<n;i++)
        {
            res=res+arr[i]-arr[maxsum];
            maxsum++;
            if(res>maxm)
            {
                maxm=res;
            }
        }
        System.out.println(maxm);
    }
}



//Given an array of integers and a number k, find the maximum sum of a subarray of size k.
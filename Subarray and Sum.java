import java.util.*;
class Main{
     public static void findsum(int[] arr,int n,int k){
      int tsum=0;
	for(int i = 0; i < n; ++i)
	{
		tsum+=arr[i];
	}
	if ((tsum%k)!=0)
	{
		System.out.println(1);
	}
	else
	{
		int ini=0;
		while (ini<n && arr[ini]%k==0)
		{
			ini++;
		}

		int fin=n-1;
		while(fin>=0 && arr[fin]%k==0)
		{
			fin--;
		}
        int len=0;
		int sum=0;
		int count=0;
		if (ini==n)
		{
			System.out.println(-1);
		}
		else
		{
			len=Math.max(n-1-ini,fin);
		}
        for(int i=0;i<len; i++)
		{
			sum+=arr[i];
		}
		if (sum%k!=0)
		{
			count++;
		}
		
		for(int i = len;i<n; i++)
		{
			sum=sum+arr[i];
			sum=sum-arr[i - len];
			
			if (sum%k!=0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
    }

    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        findsum(arr,n,k);
	}
}


//Given an array of integers of length n and a positive integer K, the task is to find the count of the longest possible subarrays with the sum of its elements not divisible by K.
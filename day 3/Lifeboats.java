import java.util.*;
class Main{
    
    public static void lifeBoats(int n,int k,int[] arr){
    
       Arrays.sort(arr);

        int ans= 0;
        int currWgt =0;

        int i =0;
        int j = n-1;

        while(i<=j){
            currWgt = arr[i] + arr[j];
            if(currWgt<=k){
                i++;
            }
            j--;
            ans++;
        }

       System.out.println(ans);
      
    }
    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int tc=input.nextInt();
        for(int i=0;i<tc;i++){
            int n=input.nextInt();
            int k=input.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=input.nextInt();
            }
            lifeBoats(n,k,arr);
        }
    }
}

//Given n passengers who are going to board the ship for a journey. You are the captain of the ship and are responsible for the safety of the passengers.

//ou have an array W of size n which has weights of all the passengers. For ensuring the safety of the passenger, you are required to calculate the minimum number of lifeboats needed for the journey.

//Each lifeboat can carry at most 2 people at the same time, provided the sum of the weights of those people is within the limit k. (Max holding capacity of a lifeboat).

//It is ensured that each person can be carried by a lifeboat.
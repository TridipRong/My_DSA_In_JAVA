  public static void countSuchPairs(int n,int target, int[] arr){
    //write your code here
    int count=0;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(arr[i]+arr[j]==target)
            {
                count++;
            }
        }
    }
    System.out.println(count);
  }
//You are given an array A of N integers along with a target integer. Your task is to find out the number of pairs of integers present in the array whose sum is equal to the target value.



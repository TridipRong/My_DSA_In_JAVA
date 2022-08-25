import java.util.*;

class Main{
    
     public static int[] twosum(int[] nums, int k){
    Arrays.sort(nums);
    int left=0;
    int right=nums.length-1;
    int sum=0;
   while(left<right){
       sum=nums[left]+nums[right];
       if(sum==k)
       {
         return new int[] {left, right};
       }
       else if(sum>k){
           right--;
       }
       else{
           left++;
       }
       
   }
     return new int[] {};
    }
    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        
        int t=input.nextInt();
        for(int i=0;i<t;i++){
           int n=input.nextInt();
           int k=input.nextInt();
           
           int[] nums=new int[n];
           for(int j=0;j<n;j++){
               nums[j]=input.nextInt();
             
           }
          int[] indices=twosum(nums,k);
          
           if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
            System.out.println("-1"+" "+"-1");
        }
        }
      
    }
    
}



//Given a sorted array of integers, return indices of two numbers such that they add up to a target value.

//Print -1 -1 if not found.
import java.util.*;

class Main{
    
    public static void swastikaSum(int k,int a,int[][] arr){
         int sum=0;
    int sum1=0;
 Double n=Math.floor(k/2);
   Double newData = new Double(n);
    int km = newData.intValue();
  Double z=Math.floor(a/2);
   Double newd = new Double(z);
    int km1 = newd.intValue();
    
    //part1
    
    for(int i=0;i<=km;i++){
        sum+=arr[i][0];
    }
    for(int j=1;j<a;j++){
        sum+=arr[km][j];
    }
    for(int m=km + 1;m<k;m++){
        sum+=arr[m][a-1];
    }
    
    //part2
    
    for(int i=0;i<=km1;i++){
        sum1+=arr[k-1][i];
    }
    for(int j=k-2;j>=0;j--){
      sum1+=arr[j][km1];
    }
    for(int g=km1+1;g<a;g++){
        sum1+=arr[0][g];
    }
    
    System.out.println(sum1-sum);
    }
    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int k=input.nextInt();
        int a=input.nextInt();
        int[][] arr=new int[k][a];
        for(int i=0;i<k;i++){
            for(int j=0;j<a;j++){
                arr[i][j]=input.nextInt();
            }
        }
        swastikaSum(k,a,arr);  
    }
}

//You are given a 2d array with n  rows and mcolumns where n and m are always odd. There are two different parts present in the 2d array and the sum of all the elements of the first part is referred as sum1 and that of the other is referred as sum2. You have to find the absolute difference between sum1 and sum2.


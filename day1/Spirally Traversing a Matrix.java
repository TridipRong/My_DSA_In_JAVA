import java.util.*;

class Main{
    public static void spiral(int n, int[][] arr){
    int top=0;
    int left=0;
    int right=n-1;
    int buttom=n-1;
    int count=0;
    StringBuilder box=new StringBuilder();
    while(count<n*n){
    for(int i=top;i<=right && count<n*n;i++){
      box.append(Integer.toString(arr[top][i])+" ");
       count++;
    }
    left++;
    for(int j=left;j<=buttom && count<n*n;j++){
        box.append(Integer.toString(arr[j][buttom])+" ");
        count++;
    }
    right--;
    for(int k=right;k>=top && count<n*n;k--){
        box.append(Integer.toString(arr[buttom][k])+" ");
        count++;
    }
    buttom--;
    for(int l=buttom;l>=left && count<n*n;l--){
        box.append(Integer.toString(arr[l][top])+" ");
        count++;
    }
    top++;
    }
   System.out.println(box);
    }
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        int n=input.nextInt();
        
         int[][] arr=new int[n][n];
             
             for(int j=0;j<n;j++){
                 for(int k=0;k<n;k++){
                     arr[j][k]=input.nextInt();
                 }
             }
           
        spiral(n,arr);
        
    }
    
    
}



//Given a matrix of size n by n. Traverse and print the matrix in spiral form.
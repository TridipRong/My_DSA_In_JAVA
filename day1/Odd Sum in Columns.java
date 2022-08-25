mport java.io.*;
 
class Main
{ 

 public static void oddSumInColumns(int n,int m,int[][] arr){
    for(int i=0;i<m;i++){
        int ans=0;
        for(int j=0;j<n;j++){
            if((arr[j][i])%2==1){
               ans=ans+arr[j][i] ;
            }
            
        }
        System.out.println(ans);
    }
  }
public static void main (String[] args)
{
    int arr[][] = {{1,2,3},{4,5,6}, {7,8,9}};
    oddSumInColumns(arr, 3, 3);
}
}

//You are given a 2D array, whose dimensions are stored in two variables with the nameNandM

//The value stored inNdenotes the number of rows, and the value inMdenotes the number of columns

//The 2D array is stored in a variable with the namearr

//For all columns, you have to print the sum of odd elements present in the column


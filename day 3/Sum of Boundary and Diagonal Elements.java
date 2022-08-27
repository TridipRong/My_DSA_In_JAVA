import java.util.*;

class Main{

	public static void diagonalBoundarySum(int arr[][],int n){
		int requiredSum = 0;
	
		for (int i=0;i<n;i++) {
			for (int j=0;j<n;j++) {
				if (i==j || (i+j)==n-1){
					requiredSum += arr[i][j];
				}
				else if (i==0 || j==0 || i==n-1|| j==n-1){
					requiredSum += arr[i][j];
				}
			}
	}
		System.out.println(requiredSum);
	}
	public static void main(String args[])
	{
	     Scanner input=new Scanner(System.in);
	     int n=input.nextInt();
	     int[][] arr=new int[n][n];
	     for(int i=0;i<n;i++){
	         for(int j=0;j<n;j++){
	             arr[i][j]=input.nextInt();
	         }
	     }
		diagonalBoundarySum(arr,n);
	}
}

//You will be given an n by n matrix. You will have to calculate the sum of the boundary and diagonal elements of the matrix. Avoid adding an element twice, if it is counted in boundary elements then don't consider it twice in the diagonal element
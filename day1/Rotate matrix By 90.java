import java.util.*;
class Main{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
            int n=input.nextInt();
            int[][] matrix=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    matrix[i][j]=input.nextInt();
                }
            }
                
        for(int i = matrix[0].length-1;i>=0;i--){
       StringBuilder bag =new StringBuilder();
        for(int j = 0 ; j<n; j++){
            bag.append(Integer.toString(matrix[j][i])+" ");
        }
        System.out.println(bag);
    }
	}
}

//Given a squarematrixof sizeN, turn it by 90 degrees in an anti-clockwise direction, as shown in sample input.
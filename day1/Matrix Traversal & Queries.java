import java.util.*;
class Main{
    
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        for(int c=0;c<t;c++){
            int n=input.nextInt();
            int m=input.nextInt();
            int k=input.nextInt();
            int[][] matrix=new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    matrix[i][j]=input.nextInt();
                }
                
            }
                if(k==1)
   {
      StringBuilder output = new StringBuilder();
  for(int i =0;i<n;i++)
  {
    if(i%2==0)
    {
    for(int j=0;j<m;j++)
      {
        output.append(Integer.toString(matrix[i][j])+ " ");
      }
    }
    if(i%2==1)
    {
    
      for(int j=m-1;j>=0;j--)
        {
          output.append(Integer.toString(matrix[i][j])+ " ");
        }
       
    }
    
  }
   System.out.println(output) ;
}
else if(k==2){
     StringBuilder output1 = new StringBuilder();
  for(int i =0;i<n;i++)
  {
    if(i%2==0)
    {
    for(int j=m-1;j>=0;j--)
      {
        output1.append(Integer.toString(matrix[i][j])+ " ");
      }
    }
    if(i%2==1)
    {
    
      for(int j=0;j<m;j++)
        {
          output1.append(Integer.toString(matrix[i][j])+ " ");
        }
       
    }
    
  }
   System.out.println(output1); 
        }
        }
	}
}



//You are given a matrix of size n x m , and two types of queries are to be performed on this matrix. The two types of queries are

//q = 1, for this type of query, the matrix is to be traversed, as shown in Fig. 1   ------->

//q = 2, for this type of query, the matrix is to be traversed as shown in Fig. 2   <----------
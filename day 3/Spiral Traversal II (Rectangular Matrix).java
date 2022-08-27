import java.util.*;
class Main{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int t=input.nextInt();
        for(int i=0;i<t;i++){
          int r=input.nextInt();
          int c=input.nextInt();
          int [][] arr=new int[r][c];
          for(int p=0;p<r;p++){
              for(int q=0;q<c;q++){
                  arr[p][q]=input.nextInt();
              }
          }
          spiralmatrixtwo(r,c,arr);
        }
	}
	public static void spiralmatrixtwo(int r,int c,int [][] arr){
	   
          int top=0;
    int left=0;
    int right=c-1;
    int buttom=r-1;
    int count=0;
    StringBuilder box=new StringBuilder();
    while(count<r*c){
    for(int i=buttom;i>=top && count<r*c;i--){
      box.append(Integer.toString(arr[i][top])+" ");
       count++;
    }
    left++;
    for(int j=left;j<=right && count<r*c;j++){
        box.append(Integer.toString(arr[top][j])+" ");
        count++;
    }
    top++;
    for(int k=top;k<=buttom && count<r*c;k++){
        box.append(Integer.toString(arr[k][right])+" ");
        count++;
    }
    right--;
    for(int l=right;l>=top && count<r*c;l--){
        box.append(Integer.toString(arr[buttom][l])+" ");
        count++;
    }
    buttom--;
     }
       System.out.println(box);
	}
}

//You are given a matrix of size N x M.

//Print the spiral traversal of the matrix.
//spiral by column
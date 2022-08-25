import java.util.*;
class Main{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int k=input.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int c=0;
        int c1=0;
        for(int j=0;j<n;j++){
            if(arr[j]<=k){
                c++;
            }
            else{
                c1++;
                if(c1>=2){
                    break;
                }
            }
        }
        System.out.println(c);
	}
}


//Noddy has an exam in which each question has a difficulty level in the form of an Integer. Now, Noddy can only solve the problems that have difficulty level less than or equal to X. Now the rules are-

//The score of the student is equal to the maximum number of answers he/she has attempted without skipping a question.

//The student is allowed to skip just "one" question that will not be counted in the continuity of the questions.

//Note- Assume the student knows the solution to the problem he/she attempts and always starts the paper from the first question.

//Given the number of Questions, N, the maximum difficulty level of the problem Noddy can solve, X, and the difficulty level of each question in the form of an array

//Determine the maximum score that Noddy can score?
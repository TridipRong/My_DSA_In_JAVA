import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Main{
public static void main(String[] args) throws IOException
{
    BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(input.readLine());
    String s[]=input.readLine().trim().split(" ");
    Queue<Integer> q=new LinkedList<Integer>();
    for(int i=0;i<n;i++)
    {
        q.add(Integer.parseInt(s[i]));
    }
    String s2[]=input.readLine().trim().split(" ");
    Queue<Integer> q2=new LinkedList<Integer>();
    for(int i=0;i<n;i++)
    {
        q2.add(Integer.parseInt(s2[i]));
    }
    orderingProcess(n,q,q2);
}
private static void orderingProcess(int n, Queue<Integer> q, Queue<Integer> q2) 
{
    int i=0;
    while(true)
    {   if(q.peek()!=q2.peek())
        {
            int a=q.peek();
            q.remove();
            q.add(a);               
            i++;
        }
        if(q.peek()==q2.peek())
        {
            q.remove();
            q2.remove();
            i++;
        }
        if(q.isEmpty()  )
        {
            break;
        }
    }
    System.out.println(i);  
}    
}



//You are the operations manager of Masai School, and N number of processes have to be executed by you.All the processes have a unique number assigned to them from1 to N.

//You are given two arrays :

//The first array denotes the calling order, in which the processes are being started.
//The second array denotes theidealorder in which all the processes should have been executed.


//Note : Executing a process, or changing the position takes 1 unit of time.
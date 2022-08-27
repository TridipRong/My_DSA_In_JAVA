import java.util.*;
class Main{
    public static void main(String arg[]){
        Scanner input=new Scanner(System.in);
        String str=input.next();
        String [] st=str.split("");
        
        eMaze(st);
	}
	public static void eMaze(String [] st){
	    int lr=0;
	    int ud=0;
	    for(int i=0;i<st.length;i++){
	        if(st[i].equals("L")){
	            lr=lr-1;
	        }
	        else if(st[i].equals("R")){
	            lr=lr+1;
	        }
	         else if(st[i].equals("U")){
	            ud=ud+1;
	        }
	         else if(st[i].equals("D")){
	            ud=ud-1;
	        }
	        else{
	            continue;
	        }
	       
	    }
	    System.out.println(lr+" "+ud);
	}
}

//Sarvagaya is trapped in maze. The Masai command center sent him a string which decodes to come out from the maze. He is initially at (0, 0). String contains L, R, U, D denoting left, right, up and down. In each command he will traverse 1 unit distance in the respective direction.

For example if he is at (2, 0) and the command is L he will go to (1, 0).
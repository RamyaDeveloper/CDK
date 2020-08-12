import java.util.Scanner;
public class Stack {
	int top=-1;
	int count=5;
	int arr[]=new int[5];
	void push(int ele)
	{	
		arr[++top]=ele;

	}
   int pop()
   {
	  
	  if(isEmpty())
	  {return 0;}
	  else
	  return arr[top--];
	 
   }
    boolean isEmpty()
   {
	   return  (top==-1);
   }
    int top()
    {
    	return arr[top];
    }
   
	public static void main(String[] args) {
		Stack s=new Stack ();
		int op;
		int ele;
		int arr[]=new int[s.count];
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("please enter 1.Push 2.Pop 3.Top 4.Stop");
			
			switch(sc.nextInt())
			{
			case 1:
				if(s.top>=(s.count-1))
				System.out.println("Stack is full");
				else
				s.push( sc.nextInt());
			break;
			case 2:
				int r=s.pop();
				if(r!=0)
			    System.out.println(	r);
			break;
			case 3:
				System.out.println(s.top());
			break;
			case 4:
				System.exit(0);
			default:
				System.out.println("wrong option");
			}
			
			}
		
	}

}

import java.util.*;
//import java.util.Scanner;
class Stack{
	public int s[];
	public int top;
	public int max;
	public int e;
	Stack(int size)
	{
		s = new int[size];
		max = size;
		top = -1;
		e=top;
	}
	public void push(){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = input.nextInt();
		if(top==max-1){
			System.out.println("Stack is full ");
			System.exit(0);
		}else{
			top++;
			s[top]=n;
		}
	}
	public  void display(){
		if(top==-1){
			System.out.println("Stack is empty ");
			//System.exit(0);
		}else{
			System.out.println("Elements of the Stack are: ");
			for(int i=top;i>=0;i--){
				System.out.println(s[i]);
			}
		}
	}
	public void pop(){
		
		if(top==-1){
			System.out.println("Stack is underflow: ");
			System.exit(0);
		}else{
			 e= s[top];
			top--;
		}
		System.out.println("Revoing: " +e);
	}
	public static void main(String args[]){
		Stack ob =new Stack(5);
		while(true){
			System.out.println("1.PUSH||2.POP||3.DISPLAY||4.EXIT ");
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your choice ");
			int c = input.nextInt();
			switch(c){
				case 1: ob.push();
				break;
				case 2: ob.pop();
				break;
				case 3: ob.display();
				break;
				case 4: System.exit(0);
				default: System.out.println("Wrong Choice||||");
			}
		}
		
	}
}
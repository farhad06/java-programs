import java.util.*;
public class Queue{
public int q[],rear,front,max;
  Queue(int size){
  	q = new int [size];
  	max=size;
  	rear=front=-1;
}
public void insert(){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a number to be insert: ");
	int n = input.nextInt();
	if(rear==max-1){
		System.out.println("Queue is full ");
	}else{
		if(rear==-1){
			rear++;
			front++;
			q[rear]=n;
		}else{
			rear++;
			q[rear]=n;
		}
	}

}
public void delete(){
	if(front==-1){
		System.out.println("Queue is under flow ");
	}else{
		if(rear==front){
			System.out.println(q[front] + " is deleted ");
			rear=-1;
			front=-1;
	}else{
		System.out.println(q[front] + " is deleted ");
		front++;

	}
}

}
public void display(){
	if(rear==-1 && front==-1){
		System.out.println("Queue is empty ");
	}else{
		System.out.println("Element of the Queue are :");
		for(int i=front ;i<=rear;i++){
			System.out.print(" " + q[i] + " ");
			//System.out.println();
		}
	}
}
public static void main(String[] args) {
	Queue ob = new Queue(5);
	while(true){
		System.out.println();
		System.out.println("1.INSERT|2.DELETE|3.DISPLAY|4.EXIT ");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your choice ");
		int c = input.nextInt();
		switch(c){
			case 1: ob.insert();break;
			case 2: ob.delete();break;
			case 3: ob.display();break;
			case 4: System.exit(1);
			default: System.out.println("Wrong choice??");
		}

	}
}

}
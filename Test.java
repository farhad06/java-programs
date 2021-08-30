class Operation1{
	int data=50;
	void change(int data){
		data=data+100;
	}
}
class Operation2{
	int data=50;
	void change(Operation2 op2){
		op2.data=op2.data+100;
     }
}
public class Test{
		public static void main(String[] args) {
			Operation1 op1 = new Operation1();
			Operation2 op2 = new Operation2();
			System.out.println("In call by value Before call value is: " +op1.data);
			op1.change(70);
			System.out.println("In call by value After call value is: " +op1.data);
			System.out.println("In call by reference Before call value is: " +op2.data);
			op2.change(op2);
			System.out.println("In call by reference After call value is: " +op2.data);


		
	}
}
class A{
	public void methodA(){
		System.out.println("It is class A's method");
	}
}
class B extends A{
	public void methodB(){
		System.out.println("It is class B's method");
	}
}
public class Singel{
	public static void main(String[] args) {
		//A a = new A();
		B b = new B();
		b.methodA();
		System.out.println(" ");
		b.methodB();
	}
}
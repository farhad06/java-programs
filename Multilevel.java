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
class C extends B{
	public void methodC(){
		System.out.println("It is class C's method");
	}

}
public class Multilevel{
	public static void main(String[] args) {
		//A a = new A();
		C b = new C();
		b.methodA();
		System.out.println(" ");
		b.methodB();
		System.out.println(" ");
		b.methodC();


	}
}
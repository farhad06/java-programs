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
class C extends A{
	public void methodC(){
		System.out.println("It is class C's method");
	}

}
class D extends A{
	public void methodD(){
		System.out.println("It is class D's method");
	}

}
public class Hierarchy{
	public static void main(String[] args) {
		//A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		b.methodA();
		System.out.println(" ");
		c.methodA();
		System.out.println(" ");
		d.methodA();


	}
}
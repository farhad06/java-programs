abstract class Animal{
	public void disInfo(){
		System.out.println("I am Animal");
	}
}
class Dog extends Animal{
	// public void disInfo(){
	// 	System.out.println("I am Dog");
	// }
}
class Abstract{
	public static void main(String[] args) {
		Dog  d1 = new Dog();
		//Animal a1 = new Animal();
		d1.disInfo();
	}
}
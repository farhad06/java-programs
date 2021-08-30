class Superclass{
	int num=100;
}
class SubClass extends Superclass{
	int num=120;
	void printNm(){
		System.out.println(super.num);
	}
	public static void main(String[] args) {
		SubClass obj = new SubClass();
		obj.printNm();
	}
}
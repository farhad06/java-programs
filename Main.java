class Main{
public static void DivideByZero(){
	throw new ArithmeticException("Trying to DivideByZero");
}
public static void main(String[] args) {
	DivideByZero();
}
}

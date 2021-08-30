class Ove{
	void add(int a, int b){
		int c=a+b;
		System.out.println("The Sum of " + a + " and " + b + " is: " +c);

	}
	void add(int d,double f){
		double e= d+f;
		System.out.println("The Sum of " + d + " and " + f + " is: " +e);

	}
		void add(double m,int n){
		double o=m+n;
		System.out.println("The Sum of " + m + " and " + n + " is: " +o);

	}
		void add(double d1,double d2){
		double d3=d1+d2;
		System.out.println("The Sum of " + d1 + " and " + d2 + " is: " +d3);

	}
		void add(String s1,String s2){
		String s3=s1+s2;
		System.out.println("The concatination of two Strings is: " +s3);

	}
}
public class Overload{
	public static void main(String[] args) {
		Ove ob = new Ove();
		ob.add(3,5);
		ob.add(8,4.225);
		ob.add(5.553,9);
		ob.add(3.332,7.444);
		ob.add("Farhad","Ahamed");

		
	}
}
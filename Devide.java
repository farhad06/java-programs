import java.util.*; 
class Devide{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int n =input.nextInt();
		System.out.println("Enter the 2nd number: ");
		int m =input.nextInt();
		int a=n/m;
		int r =n%m;
		System.out.println("Reminder is : " + r);
		System.out.println("Quotient is : " + a);
		


	}
}
import java.util.*;
class NaturalNumberSum{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numbers do u want ");
		int number=sc.nextInt();
		int i,s=0;
		for(i=0;i<=number;i++){
			s=s+i;
			
		}
		System.out.println("Sum of the given number... " + s );

	}
}
import java.util.*;
public class Sum{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an valid positive integer number ");
		int n =input.nextInt();
		int q=n,s=0,r;
		while(q>0){
			r=q%10;
			s=s+r;
			q/=10;
		}
		System.out.println("Sum of the Digits is: " + s);
	}
}
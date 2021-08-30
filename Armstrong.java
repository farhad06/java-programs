import java.util.*;
public class Armstrong{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer number: ");
		int n = input.nextInt();
		int temp=n,s=0,r;
		while(temp !=0){
			r= temp %10;
			s=s+(r*r*r);
			temp/=10;
		}
		if(n==s)
			System.out.println("It is an aramstrong number ");
		   else
		   	System.out.println("It is not an aramstrong number ");
	}
}
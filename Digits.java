import java.util.*;
class Digits{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number..");
		int n =input.nextInt();
		int temp=n;
		while(temp>0){
			int r=temp%10;
			System.out.println("Splited digits are.." + r );
			temp=temp/10;
		}

		
	}
}
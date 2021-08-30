import java.util.*;
class Vowel{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Character ");
		char c = input.next().charAt(0);
		if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')
			System.out.println("Character is Vowel");
		 else
		 	System.out.println("Character is Consonent");
		
	}
}
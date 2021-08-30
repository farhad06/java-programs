import java.util.*;
class PerfectSquare{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number. ");
		int n=input.nextInt();
		int i;
	for(i=0;i<=n;i++){
		if(n==i*i){
			System.out.println("Number is a Perfect Square ");
			System.exit(1);
		}
	} 
	System.out.println("Number is a not Perfect Square ");   
	}
}
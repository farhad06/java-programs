import java.util.*;
class PositiveNegative{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number");
		int number=sc.nextInt();
	    if(number>0){
	    	System.out.println("Given number is positive ");
	    }else if(number==0){
	    	System.out.println("Given number is zero ");
	    }else{
	    	System.out.println("Given number is negtive ");
	    }

	}
}
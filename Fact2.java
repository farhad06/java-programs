import java.util.Scanner;
class Fact1{  
 int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }  
 int factt(int m){
 	int i,f=1;
 	for(i=1;i<=m;++i){
 		f=f*i;
 	}
 	return f;
 } 
 } 
 public class Fact2{
 public static void main(String args[]){ 
   Fact1 f= new Fact1(); 
  int i,fa=1; 
      Scanner input = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        int number= input.nextInt(); 
        int k= input.nextInt();
  // int number=4;//It is the number to calculate factorial
  // int   k=5;  
  // fa = factorial(number);
  // fa= factt(number);

  System.out.println("Factorial of " +number+ " is recursive way: "+f.factorial(number)); 
  System.out.println("Factorial of" +k+ " is non recursive way: "+f.factt(k));   
 }  
}  
  
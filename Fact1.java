class Fact1{  
 static int factorial(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }  
 static int factt(int m){
 	int i,f=1;
 	for(i=1;i<=m;++i){
 		f=f*i;
 	}
 	return f;
 }  
 public static void main(String args[]){  
  int i,fa=1;  
  int number=4;//It is the number to calculate factorial
  // int   k=5;  
  fa = factorial(number);
  fa= factt(number);

  System.out.println("Factorial of "+number+"is recursive way: "+fa); 
  System.out.println("Factorial of"+number+" is non recursive way:"+fa);   
 }  
}  
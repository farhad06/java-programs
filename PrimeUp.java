class PrimeUp{
	public static void main(String[] args) {
	int i,j,n=100;
	System.out.println("Prime numbers are........... ");
	for(i=2;i<=100;i++){
		int flag=1;
		for(j=2;j<=i/2;j++){
			if(i%j==0){
				flag=0;
				break;
			}
		}
		if(flag==1)
		
		System.out.print(i +" ");
	}
	}
}
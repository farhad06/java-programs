class Arm{
	public static void main(String[] args) {
		System.out.println("Armstrong are");
		for(int i=2;i<99999;i++){
			int q=i,s=0;
			while(q>0){
				int r=  q%10;
				s=s+(r*r*r);
				q/=10;
			}
			if(s==i)
				System.out.println( + i);
		}
	}
}
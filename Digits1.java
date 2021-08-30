public class Digits1{
	public void odd(){
		System.out.println("Odd numbers are........ ");
		for(int i=1;i<=100;i++){
			if(i%2 !=0){
				System.out.print(" " + i + " ");
			}
		}

	}

	public void even(){
		System.out.println("Even numbers are........ ");
		for(int j=1;j<=100;j++){
			if(j%2==0){
				System.out.print(" " + j + " ");
			}
		}
	}
}
class EvenOdd{
	public static void main(String[] args) {
		Digits1 d = new Digits1();
		d.odd();
		System.out.println();
		d.even();
	}
}
class Sorting{
	public static void main(String[] args) {
		int [] arr={20,5,60,70,3};
		int i,j,temp;
		System.out.println("Unsorted list is.........");
		for(i=0;i<5;i++){
			System.out.print(" "+ arr[i] + " ");
		}
		System.out.println();
		for(i=0;i<5;i++){
			for(j=i+1;j<5;j++){
				if(arr[j]<arr[i]){
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println("Sorted list is.........");
		for(i=0;i<5;i++){
			System.out.print(" "+ arr[i] + " ");
		}
	}
}
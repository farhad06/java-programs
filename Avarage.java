class Avarage{
  public static void main(String[] args) {
    int [] arr={10,5,20,40};
    int sum=0;
    for(int i=0;i<4;i++){
      sum= sum+arr[i];
    }
    float avg=sum/4;
    System.out.println("The avarage is....." + avg);
  }
}

import java.util.Scanner;
public class ComplexNumber{
   int  real, img;
   ComplexNumber(int r, int  i){
	this.real = r;
	this.img = i;
   }
	
   public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2)
   {
        ComplexNumber temp = new ComplexNumber(0, 0);

        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }
 public static ComplexNumber sub(ComplexNumber c1, ComplexNumber c2)
   {
        ComplexNumber temp1 = new ComplexNumber(0, 0);

        temp1.real = c1.real - c2.real;
        temp1.img = c1.img -c2.img;
        return temp1;
    }
 public static ComplexNumber mul(ComplexNumber c1, ComplexNumber c2)
   {
        ComplexNumber temp2 = new ComplexNumber(0, 0);

        temp2.real = c1.real * c2.real;
        temp2.img = c1.img * c2.img;
        return temp2;
    }

    public static void main(String args[]) {
Scanner input=new Scanner(System.in);
System.out.println("Enter real  part of 1st number: ");
int a =input.nextInt();
System.out.println("Enter real part of 2nd number: ");
int c =input.nextInt();
System.out.println("Enter imaginary part of 1st number: ");
int b =input.nextInt();
System.out.println("Enter imaginary part of 2nd number: ");
int d =input.nextInt();
	       ComplexNumber c1 = new ComplexNumber(a,b);
	       ComplexNumber c2 = new ComplexNumber(c,d);
         		ComplexNumber temp = sum(c1, c2);
ComplexNumber temp1 = sub(c1, c2);
ComplexNumber temp2 = mul(c1, c2);
        System.out.println("Sum is: "+ temp.real+" + "+ temp.img +"i");
 System.out.println("Subtraction is: "+ temp1.real+" + "+ temp1.img +"i");
 System.out.println("Multilication is: "+ temp2.real+" + "+ temp2.img +"i");
    }
}
import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        // int num;
        boolean flag = false;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter an Number: ");
        int num = input.nextInt();
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }
        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
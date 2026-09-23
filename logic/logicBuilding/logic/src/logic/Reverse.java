package logic;
import java.util.Scanner;
public class Reverse {

   public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n, digit, r = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        while(n > 0)
        {
            digit = n % 10;
            r = r * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reverse number = " + r);
    }
}
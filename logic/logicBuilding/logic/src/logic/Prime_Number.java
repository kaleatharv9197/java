package logic;
import java.util.Scanner;

public class Prime_Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        boolean flag = true;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        if(n <= 1) {
            flag = false;
        }
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                flag = false;
                break;
            }
        }
        if(flag == true) {
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not a prime number");
        }
    }
}
package logic;

import java.util.Scanner;
public class Palindrome_Number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, temp, digit, r = 0;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        temp = n;
        while(n > 0) {
            digit = n % 10;
            r = r * 10 + digit;
            n = n / 10;
        }
        if(temp == r)  {
            System.out.println("Palindrome number");
        }
        else {
            System.out.println("Not a palindrome number");
        }
    }
}

package logic;

import java.util.Scanner;

public class Armstrong_Number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n, temp, digit, sum = 0;
        System.out.print("Enter a number: ");
        n = sc.nextInt();
        temp = n;
        while(n > 0)
        {
            digit = n % 10;
            sum = sum + digit * digit * digit;
            n = n / 10;
        }
        if(temp == sum){
            System.out.println(temp+  " Armstrong number "  +(temp == sum));
        }
    }
}
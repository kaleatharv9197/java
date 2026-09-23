package logic;


import java.util.Scanner;

public class Series_Nth_Term{
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        float sum = 0.0f;
        boolean flag = true;
        for(int i=1;i<=2*n;i+=2) {
            if(flag) {
                sum = sum+((float)i / (i + 1));
                System.out.print(i + "/" + (i + 1) + " + ");
                flag = false;
            }
            else  {
                sum = sum - ((float)i / (i + 1));
                System.out.print(i + "/" + (i + 1) + " - ");
                flag = true;
            }
        }
        System.out.println("\nSum is " + sum);
       sc.close();
    }
}
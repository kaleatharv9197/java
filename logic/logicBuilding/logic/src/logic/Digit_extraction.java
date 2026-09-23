package logic;

public class Digit_extraction {

public class Pattern_Sum
{
    public static void main(String[] args)
    {
        int i, space;
        char ia;
        int sum = 0;
        for(space = 5, i = 1, ia = 'a';
            space >= 1 && i <= 5 && ia <= 'e';
            space--, i++, ia++)
        {
            // Print spaces
            for(int s = 1; s <= space; s++)
                System.out.print(" ");
            // Print numbers and calculate sum
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j);
                sum = sum + j;
            }
            // Print characters
            for(char ja = 'a'; ja <= ia; ja++)
                System.out.print(ja);
            // Next line
            System.out.println();
        }
        // Print total sum
        System.out.println("Sum of all numbers = " + sum);
    }
}
	}


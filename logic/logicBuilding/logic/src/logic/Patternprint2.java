
package logic;

public class Patternprint2 {

    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            //   spaces
            for (int space = 5; space >= i; space--) {
                System.out.print("  ");
            }
            //  numbers
            for (int j=1;j<=i;j++) {
                System.out.print(j + " ");
            }
            //   characters
            for (char j='a'; j <'a'+i;j++) {
                System.out.print(j + " ");
            }
            // next line
            System.out.println();
        }
    }
}
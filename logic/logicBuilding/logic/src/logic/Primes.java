package logic;

public class Primes {
   public static void main(String[] args) {
        int count = 0;
        for(int n = 1; n <= 100; n++) {
            boolean flag = true;
            if(n <= 1)  {
                flag = false;
            }
            for(int i=2;i<n;i++) {
                if(n%i == 0){
                    flag = false;
                    break;
                }
            }
            if(flag==true) {
                System.out.println(n+" Is Prime");
                count++;
            }
        }
        System.out.println("Total prime numbers = " + count);
    }
}
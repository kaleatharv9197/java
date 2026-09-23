package logic;
import java.util.Scanner;
public class ManuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int quantity;
        double total = 0;
        do {
            System.out.println("\n========== APNA TAPRI ==========");
            System.out.println("1. Tea      - Rs. 10");
            System.out.println("2. Coffee   - Rs. 20");
            System.out.println("3. Water    - Rs. 10");
            System.out.println("4. Maggi    - Rs. 40");
            System.out.println("0. Exit");
            System.out.println("================================");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
               case 1:
                   System.out.print("Enter quantity: ");
                   quantity = sc.nextInt();
                   total = total + (quantity * 10);
                   System.out.println("Tea added successfully!");
                   break;
               case 2:
                   System.out.print("Enter quantity: ");
                   quantity = sc.nextInt();
                   total = total + (quantity * 20);
                   System.out.println("Coffee added successfully!");
                   break;
               case 3:
                   System.out.print("Enter quantity: ");
                   quantity = sc.nextInt();
                   total = total + (quantity * 10);
                   System.out.println("Water added successfully!");
                   break;
               case 4:
                   System.out.print("Enter quantity: ");
                   quantity = sc.nextInt();
                   total = total + (quantity * 40);
                   System.out.println("Maggi added successfully!");
                   break;
               case 0:
                   System.out.println("\nThank you for visiting Apna Tapri!");
                   break;
               default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
        System.out.println("\n========== BILL ==========");
        System.out.println("Total Amount: Rs. " + total);
        System.out.println("==========================");
        sc.close();
    }
}
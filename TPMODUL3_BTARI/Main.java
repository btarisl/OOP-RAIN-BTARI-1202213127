import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner masukan = new Scanner(System.in)) {
            Restaurant resto = new Restaurant();
            int customerID, orderQty;
            try {

                System.out.println("Enter Customer ID: "); 
                customerID = masukan.nextInt();
                

                System.out.println("Enter how much food to made: ");
                orderQty = masukan.nextInt();

                Thread satuThread = new Thread(resto);
                Waiter waiter = new Waiter(customerID, orderQty);
                Thread duaThread = new Thread(waiter);

                satuThread.start();
                duaThread.start();
                satuThread.join();
                duaThread.join();

            } catch (Exception e) {
                System.out.println("Input must be Integer");
            }
        }

    }

} 

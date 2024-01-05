import java.util.Scanner;
import ericarnou68.entities.Account;
import ericarnou68.exceptions.AmountExceedsWithdrawLimit;
import ericarnou68.exceptions.NotEnoughBalance;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Holder: ");
        scanner.nextLine();
        String accountHolder = scanner.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = scanner.nextDouble();
        System.out.print("Withdraw limit: ");
        double withDrawLimit = scanner.nextDouble();

        Account account = new Account(accountNumber, accountHolder, withDrawLimit, initialBalance);

        System.out.println("\nEnter amount for withdraw: ");
        double amount = scanner.nextDouble();

        try {
            account.withdraw(amount);
            System.out.println("New balance: " + account.getBalance());

        } catch (AmountExceedsWithdrawLimit e){
            System.out.println(e.getMessage());

        } catch (NotEnoughBalance e){
            System.out.println(e.getMessage());
        }
    }
}
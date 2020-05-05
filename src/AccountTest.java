import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.53);
        System.out.printf("Account1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("Account2 Balance: $%.2f\n\n", account2.getBalance());

        Scanner input = new Scanner(System.in);
        double depositAmount;
        double debitAmount;

        System.out.println("Enter the deposit amount for account1: ");
        depositAmount = input.nextDouble();
        System.out.printf("\nAdding $%.2f to account1 balance\n\n", depositAmount);
        account1.credit(depositAmount); // add to account1 balance

        // display balances

        System.out.printf("Account1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("Account2 balance: $%.2f\n", account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble();
        System.out.printf("\nAdding $%.2f to account2 balance\n\n", depositAmount);
        account2.credit(depositAmount); //add to account2 balance

        //display balances
        System.out.printf("Account1 balance: $%.2f\n", account1.getBalance());
        System.out.printf("Account2 balance: $%.2f\n", account2.getBalance());

        System.out.print("Enter debit amount for account1: ");
        debitAmount = input.nextDouble();
        System.out.printf("\nSubtracting $%.2f from account1 balance\n\n", debitAmount);

        //add testing section for ‘debit’ method (account1) and display both balances
        account1.debit(debitAmount);  // withdrawing amount of money from account1 balance

        //display balances
        System.out.printf("Display Account1 balance after debit subtraction $%.2f\n", account1.getBalance());
        System.out.printf("Display Account1 balance after debit subtraction $%.2f\n", account2.getBalance());

        System.out.print("Enter debit amount for account2: ");
        debitAmount = input.nextDouble();
        System.out.printf("\nSubtracting $%.2f from account2 balance\n\n", debitAmount);

        //// add testing section for ‘debit’ method (account2) and
        account2.debit(debitAmount); // removing money from account2

        input.close();

        //display balances
        System.out.printf("Display Account1 balance after debit subtraction $%.2f\n", account1.getBalance());
        System.out.printf("Display Account2 balance after debit subtraction $%.2f\n", account2.getBalance());
    }
}


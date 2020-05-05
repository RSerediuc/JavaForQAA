public class SavingsAccountTest {

    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000.00, 0); // instantiate savingsAccount
        SavingsAccount saver2 = new SavingsAccount(3000.00, 0); // instantiate savingsAccount

        //set  interest rate to 4%
        SavingsAccount.modifyInterestRate(0.04);
        System.out.println("New interest rate is " + saver1.getAnnualInterestRate() + "%");

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("New balance for saver1 is = $%.2f\n", saver1.getSavingsBalance());
        System.out.printf("New balance for saver2 is = $%.2f\n", saver2.getSavingsBalance());

        //set the balance back to initial values
        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);

        //Set interest rate to 5%
        SavingsAccount.modifyInterestRate(0.05);

        System.out.println("New interest rate is " + saver1.getAnnualInterestRate() + "%");

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.printf("New balance for saver1 is $%.2f\n", saver1.getSavingsBalance());
        System.out.printf("New balance for saver2 is $%.2f\n", saver2.getSavingsBalance());
    }
}

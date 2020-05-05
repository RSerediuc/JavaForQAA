public class Account {
    private double balance;

    public Account(double initialBalance) {
        if (initialBalance >= 0.0) {
            balance = initialBalance;
        }
    }

    public void credit(double amount) {
        if (amount < 0) {
            System.out.println("You can't add negative values to the balance");
        } else {
            balance = balance + amount;
        }
    }

    public void debit(double amount) {
        if (amount > balance || amount < 0) {
            System.out.print("Debit amount exceeded balance or you entered a negative value\n");
        } else {
            balance = balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }

}

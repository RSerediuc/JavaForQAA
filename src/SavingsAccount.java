public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double initialSavingsBalance, double annIntRate) {
        if(annIntRate >= 0.0) {
            annualInterestRate = annIntRate;
        } else {
            annualInterestRate = 0.0;
        }

        if (initialSavingsBalance >= 0.0) {
            savingsBalance = initialSavingsBalance;
        } else {
            savingsBalance = 0.0;
        }
    }

    public void calculateMonthlyInterest() {
       double monthlyInterestRate = (savingsBalance * annualInterestRate)/12;
        savingsBalance = savingsBalance + monthlyInterestRate;
    }

    public static void modifyInterestRate(double interestRate) {
        if(interestRate > 0.0) {
            annualInterestRate = interestRate;
        }
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void  setSavingsBalance(double newBalance) {
        if (newBalance >= 0.0) {
            savingsBalance = newBalance;
        } else {
            savingsBalance = 0.0;
        }
    }


}


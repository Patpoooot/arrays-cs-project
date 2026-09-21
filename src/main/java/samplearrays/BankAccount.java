package samplearrays;

public class BankAccount {

    String name;
    double currentBalance;
    double[] transactions = new double[1000];
    int idx = 0;

    public BankAccount(String name, int startingBalance){
            this.name = name;
            this.currentBalance = startingBalance;
    }

    public void deposit(double amount){
        if (amount <= 0) {
            System.out.println("You cannot diposit a negative ammount.");
            return;
        }

        currentBalance += amount;
        transactions[idx] = (+amount);
        idx++;

        System.out.println(name + " diposit : " + amount + ". New balance : " + currentBalance);
    }

    public void withdraw(double amount){
        if (amount > currentBalance) {
            System.out.println("This passes your balance. Unseccessful withdraw.");
            return;
        }

        currentBalance -= amount;
        transactions[idx] = (-amount);
    }

    public void displayTransactions(){
        System.out.println("Your list of transaction is the following: ");

        for(double t : transactions) {
            System.out.println(t);
        }
    }

    public void displayBalance(){
        System.out.println("The current balance of the account is : " + currentBalance);
    }

    public static void main(String[] args) {

        BankAccount john = new BankAccount("John Doe", 100);

        // ----- DO NOT CHANGE -----

        //Testing..
        john.displayBalance();
        john.deposit(0.25);
        john.withdraw(100.50);
        john.withdraw(40.90);
        john.deposit(-90.55);
        john.deposit(3000);
        john.displayTransactions();
        john.displayBalance();

        // ----- DO NOT CHANGE -----

    }

}

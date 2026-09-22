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
            System.out.println("Deposit must be positive.");
            return;
        }

        if (idx >= transactions.length) {
            System.out.println("Transaction history is full.");
            return;
        }
        currentBalance += amount;
        transactions[idx] = (+amount);
        idx++;

        System.out.println(name + " diposit : " + amount + ". New balance : " + currentBalance);
    }

    public void withdraw(double amount){
        if (amount > currentBalance || amount <= 0) {
            System.out.println("Unseccessful withdraw.");
            return;
        }

        if (idx >= transactions.length) {
            System.out.println("Transaction history is full.");
            return;
        }
        currentBalance -= amount;
        transactions[idx] = (-amount);
        idx++;
    }

    public void displayTransactions(){
        System.out.println("Your list of transaction is the following: ");

        for(int i=0; i<idx; i++) {
            System.out.println(transactions[i]);
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

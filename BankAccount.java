import java.util.*;

class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    BankAccount(String accountHolder, String accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: ₹" + amount);
        } else {
            System.out.println("Invalid amount!");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    void displayDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        checkBalance();
    }
}

public class BankSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = null;
        int choice;

        do {
            System.out.println("\n=== Bank Menu ===");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Account Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    if (account == null) {
                        System.out.print("Enter account holder name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter account number: ");
                        String accNum = sc.nextLine();
                        account = new BankAccount(name, accNum);
                        System.out.println("Account created successfully!");
                    } else {
                        System.out.println("Account already exists.");
                    }
                    break;

                case 2:
                    if (account != null) {
                        System.out.print("Enter deposit amount: ₹");
                        double deposit = sc.nextDouble();
                        account.deposit(deposit);
                    } else {
                        System.out.println("No account found. Please create one.");
                    }
                    break;

                case 3:
                    if (account != null) {
                        System.out.print("Enter withdraw amount: ₹");
                        double withdraw = sc.nextDouble();
                        account.withdraw(withdraw);
                    } else {
                        System.out.println("No account found. Please create one.");
                    }
                    break;

                case 4:
                    if (account != null) {
                        account.checkBalance();
                    } else {
                        System.out.println("No account found. Please create one.");
                    }
                    break;

                case 5:
                    if (account != null) {
                        account.displayDetails();
                    } else {
                        System.out.println("No account found. Please create one.");
                    }
                    break;

                case 6:
                    System.out.println("Thank you for using the bank system.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);

        sc.close();
    }
}

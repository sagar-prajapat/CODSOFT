import java.util.Scanner;

class BankAccount {
    private double bal;

    public BankAccount(double startBalance) {
        this.bal = startBalance;
    }

    public double getBal() {
        return bal;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            bal += amt;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= bal) {
            bal -= amount;
            return true;
        } else {
            System.out.println("invalid amount.");
            return false;
        }
    }
}

class ATM {
    private BankAccount account;

    public ATM(BankAccount account) {
        this.account = account;
    }

    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Withdraw(scanner);
                    break;
                case 2:
                    Deposit(scanner);
                    break;
                case 3:
                    CheckBalance();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

    }

    private void Withdraw(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        double amt = scanner.nextDouble();
        if (account.withdraw(amt)) {
            System.out.println("Successfully " + amt);
        } else {
            System.out.println("Failed " + amt);
        }
    }

    private void Deposit(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amt = scanner.nextDouble();
        account.deposit(amt);
        System.out.println("Successfully " + amt);
    }

    private void CheckBalance() {
        System.out.println("Your balance is: " + account.getBal());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter starting balance : ");
        double startBalance = sc.nextDouble();
        BankAccount account = new BankAccount(startBalance);
        ATM atm = new ATM(account);
        atm.displayMenu();
    }
}

import java.util.*;
class BankAccount {
    private String accountNumber;
    private double balance;
    private String password;
    private String accountHolderName;

    public BankAccount(String accountNumber, String accountHolderName, String password) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean authenticate(String inputPassword) {
        return password.equals(inputPassword);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into " + accountHolderName + "'s account successfully.");
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from " + accountHolderName + "'s account successfully.");
            System.out.println("New balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

public class BankingApp {
    private static Map<String, BankAccount> accounts = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nBanking Management Application");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. View Balance");
            System.out.println("5. View All Account Details");
            System.out.println("6. Exit");
            System.out.print("Select an option (1-6): ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
            case 1:
                System.out.print("Enter account number: ");
                String accountNumber = scanner.nextLine();
                System.out.print("Enter account holder's name: ");
                String accountHolderName = scanner.nextLine();
                System.out.print("Enter password: ");
                String password = scanner.nextLine();
                System.out.print("Confirm password: ");
                String confirmPassword = scanner.nextLine();

                if (password.equals(confirmPassword)) {
                    accounts.put(accountNumber, new BankAccount(accountNumber, accountHolderName, password));
                    System.out.println("Account created successfully.");
                } else {
                    System.out.println("Password and confirm password do not match. Account creation failed.");
                }
                break;
            case 2:
                System.out.print("Enter account number: ");
                accountNumber = scanner.nextLine();
                if (accounts.containsKey(accountNumber)) {
                    System.out.print("Enter password: ");
                    password = scanner.nextLine();
                    BankAccount account = accounts.get(accountNumber);
                    if (account.authenticate(password)) {
                        System.out.print("Enter deposit amount: $");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("Authentication failed... Invalid password.");
                    }
                } else {
                    System.out.println("Account not found.");
                }
                break;
            case 3:
                System.out.print("Enter account number: ");
                accountNumber = scanner.nextLine();
                if (accounts.containsKey(accountNumber)) {
                    System.out.print("Enter password: ");
                    password = scanner.nextLine();
                    BankAccount account = accounts.get(accountNumber);
                    if (account.authenticate(password)) {
                        System.out.print("Enter withdrawal amount: $");
                        double withdrawalAmount = scanner.nextDouble();
                        account.withdraw(withdrawalAmount);
                    } else {
                        System.out.println("Authentication failed. Invalid password.");
                    }
                } else {
                    System.out.println("Account not found.");
                }
                break;
            case 4:
                System.out.print("Enter account number: ");
                accountNumber = scanner.nextLine();
                if (accounts.containsKey(accountNumber)) {
                    System.out.print("Enter password: ");
                    password = scanner.nextLine();
                    BankAccount account = accounts.get(accountNumber);
                    if (account.authenticate(password)) {
                        double balance = account.getBalance();
                        System.out.println("Account balance: $" + balance);
                    } else {
                        System.out.println("Authentication failed. Invalid password.");
                    }
                } else {
                    System.out.println("Account not found.");
                }
                break;
   
            case 5:
                System.out.println("Account Details:");
                for (BankAccount account : accounts.values()) {
                    System.out.println("Account Holder's Name: " + account.getAccountHolderName());
                    System.out.println("Account Number: " + account.getAccountNumber());
                    System.out.println("Account Balance: $" + account.getBalance());
                    System.out.println();
                }
                break;
               
            case 6:
                exit = true;
                System.out.println("Exiting the application. Thank you!");
                break;
                   
            default:
                System.out.println("Invalid option. Please select again.");
            }
        }

        scanner.close();
    }
}

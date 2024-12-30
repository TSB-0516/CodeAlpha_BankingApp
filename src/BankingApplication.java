package src;

import java.util.Scanner;

public class BankingApplication {
    private double balance = 0;
    private final Scanner scanner = new Scanner(System.in);

    public void start() {
        while (true) {
            System.out.println("\nWelcome to Simple Banking Application");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> deposit();
                case 2 -> withdraw();
                case 3 -> checkBalance();
                case 4 -> {
                    System.out.println("Thank you for using the banking application!");
                    return;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid deposit amount. Please try again.");
        } else {
            balance += amount;
            System.out.println("Successfully deposited Rs. " + amount);
        }
    }

    private void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount. Please try again.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Please try again.");
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew Rs. " + amount);
        }
    }

    private void checkBalance() {
        System.out.println("Your current balance is Rs. " + balance);
    }
}

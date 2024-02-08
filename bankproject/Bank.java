package bankproject;

import java.util.Scanner;

public class Bank {
    Scanner input = new Scanner(System.in);

    // Create a constructor...
    Bank() {
        System.out.println("Welcome to Laptop Bank... (LB)");
        landing();
    }

    public void landing() {
        Customer customer = new Customer();

        System.out.println("1. Create an account with LB");
        System.out.println("2. Sign In to your LB account");
        System.out.println("3. Change transfer PIN");
        System.out.println("4. Check your LB balance");
        System.out.println("5. View BVN");
        System.out.println("6. Deposit funds");
        System.out.println("7. Transfer funds");
        System.out.println("8. Withdraw funds");
        System.out.println("9. Request for loan");
        System.out.println("10. Quit app");
        
        
        System.out.print("Make choice: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                customer.createAccount();
                break;
            case 2:
                // Sign In.
            case 10:
                System.out.println("Thank you for banking with Laptop bank..");
            default:
                System.out.println("Invalid choice....");
                break;
        }

    }

    // bankproject.Customer class
    public void editAccount() {
    }

    // bankproject.Customer class
    public void viewAccount() {
    }

    // bankproject.Customer class
    public void checkBalance() {
    }

    // bankproject.Customer class
    public void deleteAccount() {
    }

    // bankproject.Customer class
    public void login() {
    }

    // bankproject.Customer class
    public void logout() {
    }

    // Transaction class
    public void deposit() {
    }

    // Transaction class
    public void withdrawal() {
    }

    // Transaction class
    public void loanRequest() {
    }

    // Transaction class
    public void transfer() {
    }

    // Admin class
    public void freezeAccount() {
    }

    // Admin class
    public void releaseAccount() {
    }

    // Admin class
    public void viewCustomers() {
    }

    // Admin class
    public void creditAccount() {
    }
}

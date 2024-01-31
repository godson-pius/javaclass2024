import java.util.Scanner;

public class Bank {
    String name;
    String location;
    int accountNumber;
    int bvn;
    double balance = 0.00;
    String state;
    int atmPin;
    int transferPin;
    String country;
    String DOB;
    String emailAddress;
    String address;
    String phoneNumber;
    String nextOfKin;
    String gender;
    String accountType;
    String occupation;
    final int ADMINPIN = 1002;

    static Scanner input = new Scanner(System.in);

    // Create a constructor...
    Bank() {
        System.out.println("Welcome to Laptop Bank (LB)");
    }

    public static void main(String[] args) {

    }

    public static void landing() {
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

        int choice = input.nextInt();
        switch (choice) {
            case 1:
                customer.createAccount();
                break;
            case 2:
                // Sign In.
            case 10:
                System.out.println("Thank you for banking with Laptop Bank..");
            default:
                System.out.println("Invalid choice....");
                break;
        }

    }

    // Customer class
    public void editAccount() {
    }

    // Customer class
    public void viewAccount() {
    }

    // Customer class
    public void checkBalance() {
    }

    // Customer class
    public void deleteAccount() {
    }

    // Customer class
    public void login() {
    }

    // Customer class
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

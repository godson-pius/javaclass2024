package bankproject;

import java.util.Random;
import java.util.Scanner;

public class Customer {
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

    public void createAccount() {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        try {
            // Collect inputs from users
            System.out.print("Enter your full name: ");
            this.name = input.nextLine();

            System.out.print("Enter your email address: ");
            this.emailAddress = input.nextLine();

            System.out.print("Enter your phone number: ");
            this.phoneNumber = input.nextLine();

            System.out.print("Enter your home address: ");
            this.address = input.nextLine();

            System.out.print("Enter your gender: ");
            this.gender = input.nextLine();

            System.out.print("Enter your country: ");
            this.country = input.nextLine();

            System.out.print("Enter date of birth: ");
            this.DOB = input.nextLine();

            System.out.print("Enter your state: ");
            this.state = input.nextLine();

            System.out.print("Enter occupation: ");
            this.occupation = input.nextLine();

            System.out.print("Enter of next of kin: ");
            this.nextOfKin = input.nextLine();

            System.out.print("Enter account type (Savings - S, Current - C): ");
            this.accountType = input.nextLine();

            boolean state = true;
            while (state) {
                System.out.print("Enter your ATM PIN: ");
                String pin = input.next();
                try {
                    this.atmPin = Integer.parseInt(pin);
                    state = false;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            System.out.print("Enter your transfer pin: ");
            this.transferPin = input.nextInt();

            // Create account number:
            this.accountNumber = rand.nextInt(10);

            // Create BVN
            this.bvn = rand.nextInt(11);

            input.close();
        } catch(Exception e) {
//            createAccount();
            System.out.println(e.getMessage());
        }
    }
}

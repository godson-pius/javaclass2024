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
    Scanner input = new Scanner(System.in);

    public void createAccount() {
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

                if (pin.length() != 4) {
                    System.out.println("Pin must be 4 digits");
                    continue;
                }
                try {
                    this.atmPin = Integer.parseInt(pin);
                    state = false;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

            boolean stateForTransferPin = true;
            while (stateForTransferPin) {
                System.out.print("Enter your Transfer PIN: ");
                String pin = input.next();

                if (pin.length() != 4) {
                    System.out.println("Pin must be 4 digits");
                    continue;
                }
                try {
                    this.transferPin = Integer.parseInt(pin);
                    stateForTransferPin = false;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }


            // Create account number:
            this.accountNumber = Helper.generateNum();
//            this.accountNumber = Math;

            // Create BVN
            this.bvn = Helper.generateNum();

            System.out.printf("Your account number is: %d\n", this.accountNumber);
            System.out.printf("Your BVN is: %d\n", this.bvn);
            System.out.printf("Your Balance is: %f\n", this.balance);

            System.out.println("========================= \n\n");
            signIn();

            input.close();
        } catch(Exception e) {
//            createAccount();
            System.out.println(e.getMessage());
        }
    }

    public void signIn() {
        System.out.println("======= Login to dashboard ========");
        try {
            System.out.print("Enter account number: ");
            int accNum = input.nextInt();

            System.out.print("Enter account pin: ");
            int accPin = input.nextInt();

            while (accNum != this.accountNumber) {
                while (accPin != this.atmPin) {
                    System.out.println("Invalid Credentials");

                    System.out.print("Enter account number: ");
                    accNum = input.nextInt();

                    System.out.print("Enter account pin: ");
                    accPin = input.nextInt();
                }
            }

            System.out.println("Logged in successful!\n\n\n");
            Bank.landing();

        } catch(Exception e) {
            signIn();
        }
    }
}

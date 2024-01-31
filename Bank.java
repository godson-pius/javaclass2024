public class Bank {
    String name;
    String location;

    // Not fulfilled... RAND
    int accountNumber;
    // Not fulfilled... RAND
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

    //Create a constructor...
    Bank() {
        System.out.println("Welcome to Laptop Bank (LB)");
    }
    
    //Customer class
    public void editAccount() {}
    //Customer class
    public void viewAccount() {}
    //Customer class
    public void checkBalance() {}
    //Customer class
    public void deleteAccount() {}
    //Customer class
    public void login() {}
    //Customer class
    public void logout() {}
    //Transaction class
    public void deposit() {}
    //Transaction class
    public void withdrawal() {}
    //Transaction class
    public void loanRequest() {}
    //Transaction class
    public void transfer() {}
    //Admin class
    public void freezeAccount() {}
    //Admin class
    public void releaseAccount() {}
    //Admin class
    public void viewCustomers() {}
    //Admin class
    public void creditAccount() {}
}

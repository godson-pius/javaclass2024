package testpackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        long number = input.nextLong();

        if (number >= 0 && number < 10_000_000_000L) {
            System.out.println(Long.toString(number).length());
        } else {
            System.out.println("Number must be a positive number... or less than ten billion");
        }
    }

}

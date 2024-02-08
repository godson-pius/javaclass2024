package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {

            System.out.print("Enter first num: ");
            int num1 = input.nextInt();

            System.out.print("Enter second num: ");
            int num2 = input.nextInt();

            System.out.println(num1/num2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

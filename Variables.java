import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num1, num2;

        // Get first number
        System.out.print("Enter first number: ");
        num1 = input.nextInt();

        // Get second number
        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        // Instantiate the MathOps Class...
        MathOps obj = new MathOps();
        obj.addTwoNums(num1, num2);



        // Close stream
        input.close();
    }
}

class MathOps {
    public void addTwoNums(int a, int b) {
        int result = a + b;
        System.out.printf("Sum of %d and %d = %d\n", a, b, result);
        System.out.println("Sum of " + a + " and " + b + " =" + result);
    }
}
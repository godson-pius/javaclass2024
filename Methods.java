import java.util.ArrayList;
import java.util.Scanner;

public class Methods {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many nums: ");
        int nums = scanner.nextInt();

        switch (nums) {
            case 10:
                System.out.println("Cannot perform operation");
                break;
            case 2:
                addNum(2, 4, nums);
                
                break;
            case 3:
                addNum(3, 4, 5, nums);
                break;
            case 4:
                addNum(5, 7, 9, 9, nums);
                break;
            case 5:
                addNum(10, 67, 88, 90, 10, nums);
                break;
            default:
                System.out.println("Cannot perform 1 || > 5 operation");
        }

        scanner.close();

    }

    public static void addNum(int a, int b, int nums) {
        int[] numHolder = new int[nums];
        int sum = 0;
        for (int i = 0; i < nums; i++) {
            System.out.printf("Enter %d number", i + 1);
            numHolder[i] = scanner.nextInt();
        }

        for (int num : numHolder) {
            sum += num;
        }

        System.out.println(sum);
    }

    public static void addNum(int a, int b, int c, int nums) {
        int[] numHolder = new int[nums];
        int sum = 0;
        for (int i = 0; i < nums; i++) {
            System.out.printf("Enter %d number", i + 1);
            numHolder[i] = scanner.nextInt();
        }

        for (int num : numHolder) {
            sum += num;
        }

        System.out.println(sum);
    }

    public static void addNum(int a, int b, int c, int d, int nums) {
        int[] numHolder = new int[nums];
        int sum = 0;
        for (int i = 0; i < nums; i++) {
            System.out.printf("Enter %d number", i + 1);
            numHolder[i] = scanner.nextInt();
        }

        for (int num : numHolder) {
            sum += num;
        }

        System.out.println(sum);
    }

    public static void addNum(int a, int b, int c, int d, int e, int nums) {
        int[] numHolder = new int[nums];
        int sum = 0;
        for (int i = 0; i < nums; i++) {
            System.out.printf("Enter %d number", i + 1);
            numHolder[i] = scanner.nextInt();
        }

        for (int num : numHolder) {
            sum += num;
        }

        System.out.println(sum);
    }
}

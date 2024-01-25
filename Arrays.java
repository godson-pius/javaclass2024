import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int[] scores = new int[5];

        // scores[0] = 10;
        // scores[1] = 50;
        // scores[2] = 100;
        // scores[3] = 150;
        // scores[4] = 20;

        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("Enter %d Number: ", i + 1);
            scores[i] = scan.nextInt();
        }

        // for (int num : scores) {
        //     System.out.println(num);
        // }

        System.out.println(scores[4]);

        scan.close();

    }
}

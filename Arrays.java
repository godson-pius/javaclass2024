import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        String[] students = new String[5];

        // students[0] = "string";
        // students[1] = "string";
        // students[2] =  "string";
        // students[3] =  "string";
        // students[4] = "string";

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {
            students[i] = scan.next();
        }

        for (String uzo : students) {
            System.out.println(uzo);
        }
        

        scan.close();

    }
}

class MultiDimensionalArray {
    int[][] multi = new int[3][4];

    MultiDimensionalArray() {
        // multi[0][0] = 10;
        // multi[0][1] = 20;
        // multi[0][2] = 5;
        // multi[0][3] = 6;
        // multi[1][0] = 77;
        // multi[1][1] = 11;
        // multi[1][2] = 10;
        // multi[1][3] = 7;
        // multi[2][0] = 89;
        // multi[2][1] = 40;
        // multi[2][2] = 41;
        // multi[2][3] = 32;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter column number: ");
                multi[i][j] = input.nextInt();
            }
        }

        input.close();
    }
}

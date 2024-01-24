import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Laptop laptop = new Laptop();

        laptop.setName("Dell");
        laptop.color = "Black";
        laptop.ram = 16;
        laptop.rom = "1TB";
        laptop.os = "Windows";
        laptop.price = 500.00f;

        
        System.out.println("Do you want to boot the sytstem? Y / N");
        char choice = scan.next().charAt(0);

        if (choice == 'Y' || choice == 'y') {
            laptop.powerOn();
            System.out.println(laptop.getName());
        } else if (choice == 'h' || choice == 'h') {
            laptop.hibernate();
        } else {
            laptop.powerOff();
        }

        scan.close();
    }
}

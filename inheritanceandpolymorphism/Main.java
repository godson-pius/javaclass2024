package inheritanceandpolymorphism;

public class Main {
    public static void main(String[] args) {
        Parent obj = new Parent() {
            @Override
            public void displayInfo() {
                System.out.println("Coming from anonymous class");
            }
        };

        Parent obj2 = new Parent() {};

        obj.displayInfo();
    }
}

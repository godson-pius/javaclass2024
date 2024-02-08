package inheritanceandpolymorphism;

public class Child extends MyAbs {
    public void displayInfo() {
        System.out.println("Info displayed from child class...");
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    @Override
    public int printNum(int num) {
        return 0;
    }

    @Override
    public String printName(String name) {
        return null;
    }
}

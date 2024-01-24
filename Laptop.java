public class Laptop {
    private String name;
    protected String color;
    float price;
    int ram;
    String rom;
    String os;

    // Constructor
    Laptop() {
        System.out.println("Welcome to the new age!");
    }

    public void powerOn() {
        System.out.println("Booting the device...");
    }

    public void powerOff() {
        System.out.println("Shutting down...");
    }

    public void powerOff(int q) {
        System.out.println("Another guy!");
    }

    public void hibernate() {
        System.out.println("Hibernating...");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

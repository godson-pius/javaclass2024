package inheritanceandpolymorphism;

public class Parent {
    protected String hero;
    Parent() {
        System.out.println("This is the parent class...");
    }

    public void setHero(String name) {
        this.hero = name;
    }

    public String getHero() {
        return hero;
    }

    public void displayInfo() {
        System.out.println("Info displayed from parent...");
    }
}

package inheritanceandpolymorphism;

public class Childtwo implements IAnimal {
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }

    @Override
    public void type() {
        System.out.println("Omnivores");
    }
}

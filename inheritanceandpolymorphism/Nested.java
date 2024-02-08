package inheritanceandpolymorphism;

public class Nested {
    public void read(String input) {
        System.out.println(input);
    }

    class Inner {
        static public void manage() {
            class MethodClass {
                public void sub() {
                    System.out.println("Sub");
                }
            }
        }
    }
}

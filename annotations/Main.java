package annotations;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
       A obj = new A();
        System.out.println(obj.getClass().isAnnotationPresent(Important.class));

       for (Method method : obj.getClass().getMethods()) {
           System.out.println(method);
           if (method.isAnnotationPresent(Important.class)) {
               System.out.println("Please treat with caution");
           } else {
               System.out.println("Don't worry much about the method");
           }
       }
    }
}

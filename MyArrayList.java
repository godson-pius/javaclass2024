import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList arrList = new ArrayList();

        arrList.add("Hello");
        arrList.add(true);
        arrList.add(10);
        arrList.add(0, 10);
        arrList.add(3, 90);
        arrList.remove(0);


        for (int i = 0; i < arrList.size(); i++) {
            System.out.println(arrList.get(i));
        }

        String name = new String("Joe");
        name = "Joshua";

        System.out.println(name);

        System.out.println(arrList);
    }
}

package annotations;

public class B extends A {
    @Override
    @Important
    public String getName(){
        return "Jacob from B";
    }
}

package annotations;

@Important
public class C {
    public void fry() {
        @Important
        int s = 89;
        System.out.println(s);
    }
}

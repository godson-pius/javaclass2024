package annotations;

@Important
public class A {
    @Important(level = "Medium")
    private String name;

    @Important(level = "Low")
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}

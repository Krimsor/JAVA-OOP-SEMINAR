public abstract class Hurdle {
    private String name;

    public Hurdle(String name) {
        this.name = name;
    }

    protected abstract boolean moving(Actions actions);

    public String getName() {
        return name;
    }
}
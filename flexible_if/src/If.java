public class If {
    Condition condition;

    public If() {
    }

    public void create(Condition condition) {
        this.condition = condition;
    }

    public boolean exec() {
        return this.condition.run();
    }
}

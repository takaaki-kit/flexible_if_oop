public class If {
    Condition condition;

    public If() {
    }

    public void create(Condition condition) {
        this.condition = condition;
    }

    public void exec(int number) {
        if( this.condition.run(number) ) {
            this.condition.result();
        }
    }
}

public class If {
    Condition condition;

    public void create(Condition condition) {
        this.condition = condition;
    }

    public boolean exec(int number) {
        if( this.condition.run(number) ) {
            this.condition.result();
            return true;
        }
        return false;
    }
}

public class If {
    Condition condition;

    public void create(Condition condition) {
        this.condition = condition;
    }

    public boolean exec(int number) {
        if( this.condition.run(number) ) {
            if( this.condition.hasNestRepository() ) {
                this.condition.select(number);
                return true;
            }
            this.condition.result();
            return true;
        }
        return false;
    }
}

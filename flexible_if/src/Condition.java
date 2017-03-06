public abstract class Condition {
    IfRepository nest_repository = null;

    public abstract boolean run(int number);
    public abstract void result(int number);

    public void nest(IfRepository nest_repository) {
        this.nest_repository = nest_repository;
    }

    public void select(int number) {
        this.nest_repository.select(number);
    }

    public boolean hasNestRepository() {
        if ( this.nest_repository != null) {
            return true;
        }
        return false;
    }
}

public abstract class NestableBranch extends Branch{
    private IfRepository repository;

    public void nest(IfRepository repository) {
        this.repository = repository;
    }

    public boolean unko(int number) {
        if ( this.condition(number) ) {
            repository.select(number);
            return true;
        }
        return false;
    }
}

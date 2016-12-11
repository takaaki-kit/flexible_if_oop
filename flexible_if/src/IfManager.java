public class IfManager {
    private IfRepository repository;

    public IfManager() {
        IfRepository repository = new IfRepository();
        this.repository = repository;
    }

    public void create() {
        this.repository.create();
    }

    public void select(int number) {
        this.repository.select(number);
    }
}

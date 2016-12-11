import java.util.*;

public class IfRepository {
    private ArrayList<If> repository;

    public IfRepository() {
        this.repository = new ArrayList<If>();
    }

    public void create() {
        If new_if = new If();
        new_if.create();
        this.repository.add(new_if);
        System.out.println("call IfRepository.create");
    }

    public void select(int number) {
        this.repository.get(number).create();
    }
}

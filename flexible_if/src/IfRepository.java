import java.util.*;

public class IfRepository {
    private ArrayList<If> repository;

    public IfRepository() {
        this.repository = new ArrayList<If>();
    }

    public void create(Condition condition) {
        If new_if = new If();
        new_if.create(condition);
        this.repository.add(new_if);
    }

    public void select(int number) {
        for(If statement : repository){
            if(statement.exec(number)){
                return;
            }
        }
    }
}

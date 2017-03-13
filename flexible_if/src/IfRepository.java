import java.util.*;

public class IfRepository {
    private ArrayList<Branch> repository;

    public IfRepository() {
        this.repository = new ArrayList<Branch>();
    }

    public void create(Branch branch) {
        this.repository.add(branch);
    }

    public void select(int number) {
        for(Branch branch : repository){
            if(branch.unko(number)){
                return;
            }
        }
    }
}

import java.util.*;

public class Selection {
    private ArrayList<Branch> selection;

    public Selection() {
        this.selection = new ArrayList<Branch>();
    }

    public void add(Branch branch) {
        this.selection.add(branch);
    }

    public void select(int number) {
        for(Branch branch : selection){
            if(branch.execute(number)){
                return;
            }
        }
    }
}

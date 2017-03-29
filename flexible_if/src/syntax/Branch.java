package syntax;

public abstract class Branch {
    private Role role;

    void setRole(Role role) {
        this.role = role;
    }

    public boolean execute(int number) {
        if ( this.condition(number) ) {
            role.execute();
            return true;
        }
        return false;
    }
    protected abstract boolean condition(int number);
}
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
    public abstract boolean condition(int number);
}

public abstract class Branch {
    private Role nanka;

    void setRole(Role nanka) {
        this.nanka = nanka;
    }

    public boolean execute(int number) {
        if ( this.condition(number) ) {
            nanka.execute();
            return true;
        }
        return false;
    }
    public abstract boolean condition(int number);
}

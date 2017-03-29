public abstract class Branch {
    private Role nanka;

    void setNanka(Role nanka) {
        this.nanka = nanka;
    }

    public boolean unko(int number) {
        if ( this.condition(number) ) {
            nanka.aho();
            return true;
        }
        return false;
    }
    public abstract boolean condition(int number);
}

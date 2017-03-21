public abstract class Branch {
    protected Nanka nanka;

    public boolean unko(int number) {
        if ( this.condition(number) ) {
            nanka.aho();
            return true;
        }
        return false;
    }
    public abstract boolean condition(int number);
}

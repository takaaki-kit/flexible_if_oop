public abstract class NonNestableBranch extends Branch{
    public abstract void result();

    public boolean unko(int number) {
        if ( this.condition(number) ) {
            this.result();
            return true;
        }
        return false;
    }
}

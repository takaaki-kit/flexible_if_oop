public abstract class NonNestableBranch extends Branch{
    public abstract void result();

    public boolean unko(int number) {
        nanka = new Nanka() {
            @Override
            public void aho() {
                result();
            }
        };
        return super.unko(number);
    }
}

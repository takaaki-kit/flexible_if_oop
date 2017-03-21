public abstract class NonNestableBranch extends Branch{
    public NonNestableBranch() {
        setNanka(new Nanka() {
            @Override
            public void aho() {
                result();
            }
        });
    }

    public abstract void result();
}

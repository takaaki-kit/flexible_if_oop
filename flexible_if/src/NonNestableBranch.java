public abstract class NonNestableBranch extends Branch{
    public NonNestableBranch() {
        setNanka(new Role() {
            @Override
            public void aho() {
                result();
            }
        });
    }

    public abstract void result();
}

public abstract class NonNestableBranch extends Branch{
    public NonNestableBranch() {
        setRole(new Role() {
            @Override
            public void execute() {
                result();
            }
        });
    }

    public abstract void result();
}

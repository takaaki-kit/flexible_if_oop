public abstract class NestableBranch extends Branch{
    private Selection selection = new Selection();

    public void nest(Branch branch) {
        this.selection.add(branch);
    }

    public boolean execute(int number) {
        setRole(new Role(){
            @Override
            public void execute() {
                selection.select(number);
            }
        });
        return super.execute(number);
    }
}

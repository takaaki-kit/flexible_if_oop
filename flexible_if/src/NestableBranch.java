public abstract class NestableBranch extends Branch{
    private Selection selection = new Selection();

    public void nest(Branch branch) {
        this.selection.add(branch);
    }

    public boolean unko(int number) {
        setNanka(new Role(){
            @Override
            public void aho() {
                selection.select(number);
            }
        });
        return super.unko(number);
    }
}

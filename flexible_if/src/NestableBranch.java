public abstract class NestableBranch extends Branch{
    private IfRepository repository;

    public void nest(IfRepository repository) {
        this.repository = repository;
    }

    public boolean unko(int number) {
        setNanka(new Nanka(){
            @Override
            public void aho() {
                repository.select(number);
            }
        });
        return super.unko(number);
    }
}

public class Main {
    public static void main(String[] args) {
        IfRepository repository = new IfRepository();

        repository.create(new NonNestableBranch(){
            @Override
            public boolean condition(int number){
                System.out.println("exec branch @ MultipleOfFive");
                return number % 5 == 0;
            }

            @Override
            public void result(){
                System.out.println("exec statement @ MultipleOfFive");
            }
        });

        MultipleOfThree three = new MultipleOfThree();

        IfRepository nest_repository = new IfRepository();
        nest_repository.create(new MultipleOfFour());
        three.nest(nest_repository);
        repository.create(three);

        repository.select(12);
    }


    private static class MultipleOfThree extends NestableBranch{
        public MultipleOfThree() {
        }

        @Override
        public boolean condition(int number) {
            System.out.println("exec branch @ MultipleOfThree");
            return number % 3 == 0;
        }
    }

    private static class MultipleOfFour extends NonNestableBranch{
        public MultipleOfFour() {
        }

        @Override
        public boolean condition(int number) {
            System.out.println("exec branch @ MultipleOfFour");
            return number % 4 == 0;
        }

        @Override
        public void result() {
            System.out.println("exec statement @ MultipleOfFour");
        }
    }
}



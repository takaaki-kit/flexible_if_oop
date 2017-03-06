public class Main {
    public static void main(String[] args) {
        IfRepository repository = new IfRepository();
        MultipleOfThree three = new MultipleOfThree();
        repository.create(three);

        IfRepository nest_repository = new IfRepository();
        NestExample1 nest_example1 = new NestExample1();
        NestExample2 nest_example2 = new NestExample2();
        nest_repository.create(nest_example1);
        nest_repository.create(nest_example2);

        three.nest(nest_repository);

        repository.create(new Condition(){
            @Override
            public boolean run(int number){
                System.out.println("exec condition @ MultipleOfFive");
                return number % 5 == 0;
            }

            @Override
            public void result(int number){
                System.out.println("exec statement @ MultipleOfFive");
            }
        });

        repository.select(33);
    }

    private static class NestExample1 extends Condition{
        public NestExample1() {
        }

        @Override
        public boolean run(int number) {
            System.out.println("exec condition @ NestExample1");
            return number % 7 == 0;
        }

        @Override
        public void result(int number) {
            System.out.println("exec statement @ NestExample1");
        }
    }

    private static class NestExample2 extends Condition{
        public NestExample2() {
        }

        @Override
        public boolean run(int number) {
            System.out.println("exec condition @ NestExample2");
            return number % 11 == 0;
        }

        @Override
        public void result(int number) {
            System.out.println("exec statement @ NestExample2");
        }
    }

    private static class MultipleOfThree extends Condition{
        public MultipleOfThree() {
        }

        @Override
        public boolean run(int number) {
            System.out.println("exec condition @ MultipleOfThree");
            return number % 3 == 0;
        }

        @Override
        public void result(int number) {
            System.out.println("exec statement @ MultipleOfThree");
        }
    }
}



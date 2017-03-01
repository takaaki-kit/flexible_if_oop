public class Main {
    public static void main(String[] args) {
        IfRepository repository = new IfRepository();
        MultipleOfThree three = new MultipleOfThree();
        Nestaro nestaro = new Nestaro();
        repository.create(three);
        repository.create(nestaro);
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

        repository.select(26);
    }

    private static class MultipleOfThree implements Condition{
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

    private static class Nestaro implements Condition{
        public Nestaro() {
        }

        @Override
        public boolean run(int number) {
            System.out.println("exec condition @ MultipleOfThree");
            return number % 13 == 0;
        }

        @Override
        public void result(int number) {
            IfRepository repository = new IfRepository();

            repository.create(new Condition(){
                @Override
                public boolean run(int number){
                    System.out.println("exec condition @ nest 4");
                    return number % 4 == 0;
                }

                @Override
                public void result(int number){
                    System.out.println("exec statement @ nest 4");
                }
            });

            repository.create(new Condition(){
                @Override
                public boolean run(int number){
                    System.out.println("exec condition @ nest 7");
                    return number % 13 == 0;
                }

                @Override
                public void result(int number){
                    System.out.println("exec statement @ nest 7");
                }
            });
            repository.select(number);
        }
    }
}



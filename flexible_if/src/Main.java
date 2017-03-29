public class Main {
    public static void main(String[] args) {
        Selection selection = new Selection();

        selection.add(new NonNestableBranch(){
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
        three.nest(new MultipleOfFour());
        selection.add(three);

        selection.select(12);
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



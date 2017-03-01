public class MultipleOfFive implements Condition{
    public MultipleOfFive() {
    }

    @Override
    public boolean run(int number) {
        System.out.println("exec condition @ MultipleOfFive");
        return number % 5 == 0;
    }

    @Override
    public void result() {
        System.out.println("exec statement @ MultipleOfFive");
    }
}

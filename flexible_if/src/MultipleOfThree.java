public class MultipleOfThree extends Condition{
    public MultipleOfThree() {
    }

    @Override
    public boolean run(int number) {
        System.out.println("exec condition @ MultipleOfThree");
        return number - 3 == 0;
    }

    @Override
    public void result() {
        System.out.println("exec statement @ MultipleOfThree");
    }
}

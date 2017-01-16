public class MultipleOfThree extends Condition{
    public MultipleOfThree() {
    }

    public boolean run(int number) {
        System.out.println("exec condition");
        return number - 3 == 0;
    }

    public void result() {
        System.out.println("exec statement");
    }
}

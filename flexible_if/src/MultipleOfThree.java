public class MultipleOfThree extends Condition{
    public boolean run(int number) {
        System.out.println("exec multiple of three");
        return number % 3 == 0;
    }

    public void result() {
        System.out.println("３の剰余だよ！");
    }
}

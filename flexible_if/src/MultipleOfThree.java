public class MultipleOfThree extends Condition{
    public MultipleOfThree() {
    }

    public boolean run(int number) {
        System.out.println("exec multiple of three");
        return number % 3 == 0;
    }
}

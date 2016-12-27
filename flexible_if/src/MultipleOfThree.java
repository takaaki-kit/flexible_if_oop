public class MultipleOfThree extends Condition{
    int number;

    public MultipleOfThree(int number) {
        this.number = number;
    }
    public boolean run() {
        System.out.println("exec multiple of three");
        return this.number % 3 == 0;
    }
}

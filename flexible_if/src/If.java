public class If {
    Condition condition;

    public If() {
    }

    public void create(Condition condition) {
        this.condition = condition;
    }

    public boolean exec(int number) {
        //もし条件式の実行結果がtrueであれば、ifブロックの中のステートメントを実行させる
        if(this.condition.run(number)) {
            this.condition.result();
        }
        return true;
    }
}

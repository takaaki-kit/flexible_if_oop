public class If {
    Condition condition;

    public void create(Condition condition) {
        this.condition = condition;
    }

    public void exec(int number) {
        //もし条件式の実行結果がtrueであれば、ifブロックの中のステートメントを実行させる
        //フレームワーク側でifステートメントを使うのってありやっけ？
        if(this.condition.run(number)) {
            this.condition.result();
        }
    }
}

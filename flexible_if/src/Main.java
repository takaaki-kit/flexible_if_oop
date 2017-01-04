import unko.Aho;

public class Main {
    public static void main(String[] args) {
        Aho aho = new Aho("unkooooooooooo");
        aho.boke();

        IfRepository repository = new IfRepository();
        MultipleOfThree three = new MultipleOfThree();
        repository.create(three);
        repository.create(three);
        repository.create(three);
        repository.create(three);
        //createするときにどの条件式を持ったクラスを渡すかを決めてやる
        //selectされたときにはその条件式を実行する
        //実行のエントリポイントはrunなど=>templateメソッド
        //
        //オブジェクトは関数へのエイリアス
        //条件文のステートメントおよび
        //if文の中で実行されるステートメントは
        //すべてオブジェクト化しておけば任意のステートメントを実行可能
        //
        // なお、selectに与える引数のnumberが条件式で使われる
        if(repository.select(3)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}


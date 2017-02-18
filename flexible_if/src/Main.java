public class Main {
    public static void main(String[] args) {
        IfRepository repository = new IfRepository();
        MultipleOfThree three = new MultipleOfThree();
        repository.create(three);
        repository.select(0);
        //createするときにどの条件式を持ったクラスを渡すかを決めてやる
        //selectされたときにはその条件式を実行する
        //実行のエントリポイントはrunなど=>templateメソッド
        //
        //オブジェクトは関数へのエイリアス
    }
}


import unko.Aho;

public class Main {
    public static void main(String[] args) {
        Aho aho = new Aho("unkooooooooooo");
        aho.boke();

        IfRepository repository = new IfRepository();
        MultipleOfThree three = new MultipleOfThree();
        MultipleOfFive five = new MultipleOfFive();
        repository.create(three);
        repository.create(five);
        repository.select(1);
        //createするときにどの条件式を持ったクラスを渡すかを決めてやる
        //selectされたときにはその条件式を実行する
        //実行のエントリポイントはrunなど=>templateメソッド
        //
        //オブジェクトは関数へのエイリアス
    }
}


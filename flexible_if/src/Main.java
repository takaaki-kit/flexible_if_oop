import unko.Aho;

public class Main {
    public static void main(String[] args) {
        Aho aho = new Aho("unkooooooooooo");
        aho.boke();

        IfRepository repository = new IfRepository();
        MultipleOfThree three = new MultipleOfThree(5);
        repository.create(three);
        //createするときにどの条件式を持ったクラスを渡すかを決めてやる
        //selectされたときにはその条件式を実行する
        //実行のエントリポイントはrunなど=>templateメソッド
        //
        //オブジェクトは関数へのエイリアス
        if(repository.select(0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}


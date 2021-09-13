//  初期化式→条件式がtrueなら処理実行→変化式→条件式がtrueなら処理実行→変化式→
public class For01 {
	public static void main(String[] args) {
        for (int number = 1; number <= 5; number++) {     //（初期化式; 条件式; 変化式）
            System.out.println("For01 = " + number);
        }
    }
}

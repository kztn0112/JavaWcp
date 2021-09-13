
//  doで処理実行→条件式がtrueなら繰り返し
public class DoWhile01 {
	public static void main(String[] args) {
        int number = 1;
        do {
            number *= 2;
            System.out.println("DoWhile01 = " + number);
        } while (number < 50);
    }
}

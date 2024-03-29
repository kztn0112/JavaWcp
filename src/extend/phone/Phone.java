package extend.phone;

//Phoneインターフェースの宣言
public interface Phone {
	final int MAX_NUMBER_DIGITS = 11;

    void call(String number);

    // defaultメソッドの宣言
    default void powerOff() {
        System.out.println("電源を切ります。");
    }
}

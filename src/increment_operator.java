
public class increment_operator {
	public static void main(String[] args) {
		int a;
		a = 10;
		a++;  // a = 11
		System.out.println(a);
		a = 10;
		a--;  // a = 9
		System.out.println(a);
		
		//前置と後置
		int c;
		a = 5;
		c = ++a;  // a をインクリメントした後に、a が c に代入される
		// それぞれの値は、a が「6」で c も「6」
		System.out.println(a);
		System.out.println(c);

		a = 5;
		c = a++;  // a を c に代入した後に、a がインクリメントされる
		// それぞれの値は、a が「6」で c が「5」
		System.out.println(a);
		System.out.println(c);
	}
}

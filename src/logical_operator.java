
public class logical_operator {
	public static void main(String[] args) {
		boolean a = true;
		boolean b = false;
		boolean c;

		c = a && true;   // c = true
		c = a && false;  // c = false
		c = b || true;   // c = true
		c = b || false;  // c = false
		c = !a;          // c = false
		c = !b;          // c = true
	}
}

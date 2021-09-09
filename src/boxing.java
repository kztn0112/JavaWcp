
public class boxing {
	Integer integer1 = 5;                   // オートボクシング
	Integer integer2 = Integer.valueOf(5);  // 明示的なボクシング
	int int1 = integer1;             // アンボクシング
	int int2 = integer2.intValue();  // 明示的なアンボクシング
}

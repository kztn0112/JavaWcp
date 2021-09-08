//プリミティブ型
public class Variable05 {
	//整数型（通常はint型、大きい値の場合はlong型（最後にlかL必須）、他にshort型、byte型）
	long long1 = 9223372036854775807;  // コンパイルエラーになる
	long long2 = 9223372036854775807L;
	short short1 = 32767;
	byte byte1 = 127;
	
	//浮動小数型（double型、float型（最後にfかF必須））
	double double1 = 1234567.89;
	double double2 = 1234567.89d;  // 明示的にすることも可能
	float float1 = 0.123;          // コンパイルエラー
	float float2 = 0.123f;
	
	//論理型（boolean型のみ）
	boolean boolean1 = true;
	boolean boolean2 = false;
	
	//文字型(char型のみ）
	char char1 = 'あ';
	char char3 = 'A';
	char char2 = 'AB'     // コンパイルエラー
	char char4 = 0x3042;  // 文字コードでひらがなの「あ」を表現
	'あ';                 // プログラム上ではchar型
	
	
}

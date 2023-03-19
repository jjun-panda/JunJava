public class test10 {

	public static void main(String[] args) {
		byte b = 127;
		int i = 100;

		System.out.println(b+i); // 127+100 = 227
		System.out.println(10/4); // 10/4 = 2 (10은 실수가 아니므로 정수로 출력)
		System.out.println(10.0/4); // 10.0/4 = 2.5 (10.0은 실수이므로 실수로 출력)
		System.out.println((char)0x12340041); 
		// 강제타입변환으로 0x41 출력
		// 0x12340041(16진수)를 2진수로 변환하면 10010001101000000000001000001
		// 여기서 10010001101000000000001000001 char(1btye)로 강제변환해야되므로 삭제
		// 010000001(2진수) = 65(10진수) = 0x41(16진수) = A(유니코드, 문자열)

		System.out.println((byte)(b+i)); // 최종값 227에서 byte로 변환해야 되므로 
		System.out.println((int)2.9 + 1.8);
		System.out.println((int)(2.9 + 1.8));
		System.out.println((int)2.9 + (int)1.8);
	}

}
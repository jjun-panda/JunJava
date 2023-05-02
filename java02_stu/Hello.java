public class Hello {
	// Hello 홍길동 5
	// Application의 진입점
	static String greeting; // 멤버 필드 선언
	// static으로 선언 된 함수는 static으로 선언된 멤버만 호출 가능
	// static은 정적 멤버 또는 Class멤버라고 한다. (static은 인스텐스(객체)와 다르다)
	public static void method01(String[] args) {
		// 문자열 변수 선언
		String name = "Python";
		name = args.length>0 ? args[0] : name; // 변수 = 조건 ? 참 : 거짓;
		// (클래스) 멤버 필드에 값 넣기
		greeting = "Hello " + name + " World!";
	}

	public static void method02(String[] args) {
		int size = 1;
		if(args.length > 1) {
			// 파라미터에 전달되는 데이터는 무조건 String입니다.
			size = Integer.parseInt(args[1]); // numeric을 실제 정수 형변환
		}
		for(int i=0; i<size; i++){
			System.out.println(greeting);
		}
	}

	  public static void main(String[] args) {
      method01(args);
      
      method02(args);
   }

}

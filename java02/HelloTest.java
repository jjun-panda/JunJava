package java02;

/*
 * C 형식의 여러 줄 주석
 */

/**
 * JAVA 형식의 여러줄 주석 
 * - javadoc 를 이용해서 문서화 가능.
 * @author 범준샘
 */

// 클래스명과 파일명은 일치
public class HelloTest {
	// 낙타봉 표기법 : 더해지는 단어의 첫 무자를 대문자로 표시해서 가독성을 높인다. JAVA, C 
	// 뱀표기법 : 파이썬 hello_test, HELLO_TEST, my_name (가독성이 높다)
	// Ctrl + Space bar
	/**
	 * 그냥 테스트용 인사 출력
	 */
	public static void hello() {  // 메소드 선언부
		// Hello World 출력
		// sysout 어시스트 자동완성
		// 어시스트 단축키 Ctrl + Space
		System.out.println("hello world");
	}
	
	// main()함수는 Application 실행의 진입점.
	public static void test01(String[] args) {
		// 함수 호출부 - 함수는 불르지 않으면 실행 안됨.
		// 프로젝트 실행 Run As > Java Application
		// 구글에서 이클립스 단축키 검색 해 보기
		hello();
	}
	// 자바에 소질 있는 사람
	// 신발장에서 신발 꺼내고 신발장 문닫고 
	// 신발장에 신발 넣을 수 있으면 소질 있는 것.
	public static void main(String[] args) {
		// 변수 선언
		// 타입 변수명 = 초기값;
		// 초기값을 리터럴이라고도 한다.
		// 타입 (자바의 기본 타입 8개)
		// 1개 논리 - boolean : true, false 저장 (크기 1bit)
		// 2개는 실수 - float, double(기본 8byte) (부동소수점 사용)  0.003141592
		//	- 부는 뜰부이다. 떠서 움직인다. 지수를 사용 하기때문에 무한대로 값 저장
		// 4개는 정수 - int (기본 4byte), long(8byte), short(-32768~32767), byte
		// 문자 타입 - char (2byte) - 65535 크기
	}
}
// - 1byte는 8bit이다.
// 인간은 10진수, 컴은 2진수를 사용.
// 8진수, 16진수를 사용 함으로 10진수를 2진수로 쉽게 변환 가능.
// binary
// 100010101101
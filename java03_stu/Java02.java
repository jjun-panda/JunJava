package java03_stu;

// public붙은 class는 파일명과 동일해야한다.
// public 접근지정자 붙이지 않으면 패키지
public class Java02 {
    void start() {
        System.out.println("start() 매소드 호출!");
    };
    void sayHello(String name) {
        return null;
        // 함수의 반환형(return type)이 void rk dksls
        // 있다는 것은 reture문이 있다는 약속
        System.out.println("Hello, " + name);
    };

    short sum(int a, int b) {
        System.out.println("3...");
        short(a + b);
    }

	public static void main(String[] args) {
        // 클래스 변수 = new 클래스();
        // 변수

		Java02 ex = new Java02();
		
        //  다음 메서드들이 정상 실행 가능하도록 메서드를 구현하라.
		ex.start();
		ex.sayHello("길동이");
		int result = ex.sum(10, 12);
        System.out.println("result: " + result);

        int sum(int x, int y) {
            return x + y;
        }
        
	}
}

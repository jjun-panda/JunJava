package java03_stu;

public class Java01 extends Object {
    // 디폴트 생성자는 컴파일러가 추가 해 준다.
    // 개발자가 생성자를 직접 만들면 컴파이러는 생성자를 만들지 않는다.(기본 생성자)
    // 생성자 만들기 단축키 : ctrl + spacebar

    public Java01() {
        // 기본 생성자 (Default Constructor)는 매개변수가 없다.
        // 개발자가 직접 만들 수 있다.
        // 개발자가 안 만들면 컴파일러가 컴파일 시 자동 추가(생성자가 있어야 컴파일 가능)
        System.out.println("디폴트 생성자 호출 됨");
    }
	public static void main(String[] args) {
        Java01 ex01; // 참조 변수 선언
        // 객체 생성 후 참조 변수에 참조값 전달
        new Java01(); // Constructor(생성자) 실행
        ex01 = new Java01();
        // 생성자는 임의 호출 불가능. 오직 생성할 때만 자동 호출 됨
        // 매소드를 가장 쉽게 만드는 법
        // 일단 없어도 있다고 생각하고 호출한다.
        // 엠박을 누르면 crete method 아이템 실행
        ex01.start();

        ex01.sayHello("길동이");

        int result = ex01.sum(10, 12);
        System.out.println("result: " + result);
    }

    // 인스턴스 (객체) 멤버 (static을 사용하지 않고 선언)
    // new 이용 후 객체 생성 후 참조 변수를 통해서 호출 가능
    // 참조변수.멤버함수()
    // 참조변수.멤버속성;
    int sum(int x, int y) {
        return x+y;
    }
    private void sayHello(String name) {
        System.out.println("Hello " + name);
    }
    private void start() {
        System.out.println("strat() 메소드 호출!");
    }
}

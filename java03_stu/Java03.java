package java03_stu;

public class Java03 {

    String hello(String str1, String str2) {
        System.out.println();
        return str1 + " " + str2;
    }

    // String[] 대괄호 붙이면 배열타입, 안붙이면 스트링 타입
	public static void main(String[] args) {
        Java03 obj = new Java03();

		String greet = obj.hello("Hello", "길동이");
		System.out.println("Message: " + greet);
	}


}

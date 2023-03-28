import java.util.Scanner;

public class ch2_12_b {
	public static void main(String[] args) {
		System.out.println("연산(단, 빈칸으로 분리하여 입력해주세요)>> ");
		Scanner math = new Scanner(System.in);
		int a = math.nextInt();
		String ab = math.next();
		int b = math.nextInt();

		switch (ab) {
			case "+":
				System.out.println(a + ab + b + "의 계산결과는 " + (a + b));
				break;
			case "-":
				System.out.println(a + ab + b + "의 계산결과는 " + (a - b));
				break;
			case "*":
				System.out.println(a + ab + b + "의 계산결과는 " + (a * b));
				break;
			case "/":
				if(b == 0) {
					System.out.println("0으로 나눌 수 없습니다.");
					System.exit(0);	//프로그램 종료
				}
				System.out.println(a + ab + b + "의 계산결과는 " + (a / b));
				break;
			}
		
		math.close();
	}
}
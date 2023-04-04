package java03_stu;
import java.util.Scanner;

public class Java17 {
	//int[] days = new int[]{};
	int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	Scanner scan = new Scanner(System.in);
	int month; //월 입력
	int day; // 일 입력
	int total = 0;

	public Java17(){
		// day01();
		day02();
		day03();
	}

	public void day02() {
		// 월/일을 입력 받아서 1년중 남은 남은 날짜를 출력한다.
		System.out.print("월/일 입력: ");
		month = scan.nextInt();
		day = scan.nextInt();
		
		// 반복문을 이용해서 days 배열의 요소를 활용한다.
		
		
		System.out.printf("%d월%d일로 부터 올해는 %d일 남았다.\n", month, day, total);
	}

	public void day03() {
		// 월/일을 입력 받아서 1년중 남은 남은 날짜를 출력한다.
		System.out.print("월/일 입력: ");
		month = scan.nextInt();
		day = scan.nextInt();
		int nextMon, nextDay;
		// 입력월일로부터 100일 후의 날짜는 00월 00일
		// 12월25일의 100일 후는 4월5일입니다.
	}
	public void day01(){

		// month에 월 입력
		// month에 해당하는 월의 날짜수를 days배열에서 가져온다.
		System.out.print("월입력: ");
		month = scan.nextInt();
		System.out.println(month+"월은 " + days[ month-1 ] + "일까지 있습니다.");
	}
	public static void main(String[] args) {
		new Java17();
	}
}

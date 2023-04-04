package java03_stu.homework;

import java.util.Scanner;

public class Calendar02 {
	int[] days = {31,28,31,30,31,30,31,31,30,31,30,31}; // 각 월에 해당되는 일
	Scanner scan = new Scanner(System.in);
	int month; //월 입력
	int day; // 일 입력
	int hundredDay =0;
	int total = 0;

	public Calendar02(){
		day();
	}

	public void day() {
		// 월/일을 입력 받아서 1년중 남은 남은 날짜를 출력한다.
		System.out.print("월 입력>> ");
		month = scan.nextInt();
		System.out.print("일 입력>> ");
		day = scan.nextInt();
		System.out.print("며칠 후 날짜를 알고 싶으신가요?>> ");
		hundredDay = scan.nextInt();


		int nd, md;
		while( total == hundredDay){
			// 배열은 0부터 시작하므로, 민액에 -1 적용하지 않을 경우 2월 입력시 배열에서 세번째에 해당되는 31로 적용된다.
			for(int i = 0; i < month-1; i++) { 
				total += days[i]; // 입력한 월에 따라 각각 일수를 더한다.
			}
		}
		nextMon = 
		nextDay = 

		System.out.printf("\"%d월%d일 기준\"%d일 후는 %d월 %d일 입니다.", month, day, hundredDay, nextMon, nextDay);
	}
		// 입력월일로부터 100일 후의 날짜는 00월 00일
		// 12월25일의 100일 후는 4월5일입니다.

	public static void main(String[] args) {
		new Calendar02();
	}
}

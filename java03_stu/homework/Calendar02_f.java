package java03_stu.homework;

import java.util.Scanner;
import static java.lang.System.out;

public class Calendar02_f {

	public static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int total = 0;
		int month = 0;
		int day = 0;
		int afterDay = 0;
		int nextMonth = 0;
		int nextDay = 0;

		// 사용자 입력할 부분
		out.print("월 입력해주세요>> ");
		month = scan.nextInt();
		out.print("일 입력해주세요>> ");
		day = scan.nextInt();
		out.print("며칠 후의 날짜를 입력해주세요>> ");
		afterDay = scan.nextInt();

		// // 월 단위 구하기
		// total = days[month-1] - day;
		
		// for(int i = month; i < 12; i++) {
		// 	total += days[i];
		// }

		// total += afterDay;
		

		// // day의 모든 요소 값을 total에 누적
		// for(int i = 0; i < days.length; i++) {
		// 	total += days[i];
		// }

		total = days[month-1] - day;
		nextMonth = month;

		out.println(total);
		out.println(month);

		while(total < afterDay) {
			// if(month == 12) { // 배열에는 0~11까지 있으므로 12는 0으로 변환
			// 	month = 1;
			// }

			nextMonth %= 12;
			total += days[nextMonth];
			nextMonth++;

			nextMonth = month + 1;

			int dayMonth = days[month];
			if(total >= dayMonth) {
				total -= dayMonth;
			} else {
				nextDay = total;
				total = 0;
			}


		}

		out.printf("%d월%d일로부터 %d일 후는 %d월%d일입니다.\n", month, day, afterDay, nextMonth, nextDay);

	}
}
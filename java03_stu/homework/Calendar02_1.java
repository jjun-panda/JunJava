package java03_stu.homework;

import java.util.Scanner;
import static java.lang.System.out;

public class Calendar02_1 {

	public static final Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
		int total = 0;
		int month = 0;
		int day = 0;

		// day의 모든 요소 값을 total에 누적해보기
		for(int i = 0; i<days.length; i++) {
			total += days[i];
		}

		out.printf("1년은 %d일 입니다.\n", total);

		out.print("월 입력>> ");
		month = scan.nextInt();
		out.print("일 입력>> ");
		day = scan.nextInt();
		

		out.printf("%d월은 %d일까지 있습니다.\n", month, days[month-1]);

		total = 0;
		for(int i =0; i < month-1; i++) {
			total += days[i];
		}
		total += day;
		out.printf("1월 1일부터 %d월 %d일 까지는 %d일 입니다.\n", month, day, total);
		

		total = days[month-1] - day;
		for(int i=month; i<12; i++) {
			total += days[i];
		}
		out.printf("%d월%d일부터 12월 31일까지는 %d일 남았습니다.\n", month, day, total);


		int last_total = days[month-1] - day;
		int last_month = 0;
		int last_day = 0;
		out.print("마지막 월 입력>> ");
		last_month = scan.nextInt();
		out.print("마지막 일 입력>> ");
		last_day = scan.nextInt();
		for(int i=month; i<12; i++) {
			last_total+= days[i];
			if(i>=13){

			}
		}
		out.printf("%d월%d일부터 %d월 %d일까지는 %d일 남았습니다.", month, day, last_month, last_day, last_total);
	}
}

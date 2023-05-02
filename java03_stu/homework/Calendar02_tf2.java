package java03_stu.homework;

import java.util.Scanner;
import static java.lang.System.*;
import java.io.PrintStream;

public class Calendar02_tf2 {
	static Scanner scan = new Scanner(System.in);
	static int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	static int month, day, nextMon, nextDay, beMon, beDay;
	static int total;
	static int max = 100;

	public static final void print(String str) {
		out.print(str);
	}

	public static PrintStream printf(String format, Object ... args) {
		return java.lang.System.out.format(format, args);
	}

	public static void main(String[] args) {
		print("월/일 입력: ");
		month = scan.nextInt();
		day = scan.nextInt();

	  // 1. total을 100으로 초기화 한다.
	  // 2. total에서 현재월의 남은 일수를 뺀다.
	  // 3. 계속해서 다음달의 날수를 total에서 계속 뺀다.
	  // 4. total이 다음 월의 날짜보다 작으면 그만 뺀다.
	  // 5. 결과 출력, 남은 토탈은 nextDay가 된다.
		total = 100;
		



		System.out.printf("%d월 %d일의 100일 후는 ", month, day);
		total = max;
		total -= days[month-1] - day;
		int idx = month % 12;
		while(total > days[idx]) {
			idx %= 12;
			total -= days[idx];
			idx++;
		}
		nextDay = total;
		nextMon = idx + 1;
		System.out.printf("%d월 %d일입니다.\n", nextMon, nextDay);
	}

	// public static void homework01(String[] args) {
	// 	print("월/일 입력: ");
	// 	month = scan.nextInt();
	// 	day = scan.nextInt();
	
	// 	System.out.printf("%d월 %d일의 100일 후는 ", month, day);
	
	//   // total이 max(100)이상 될때까지 월의 날짜 수를 누적한다.
	//   // 1. total에 현재의 월의 남은 날짜로 초기화
	//   // 2. total이 100이하이면 현재 월의 다음 달 부터 계속 total에 월의 날짜 누적 
	//   // 3. total 100이상이면 마지막달의 날짜 수에서 넘치는 만큼 빼기
	//   // nextDay = days[nextMon-1] - (total - max)
	// 	total = days[month-1] - day;
	// 	nextMon = month;
	// 	while(total < max) {
	// 		nextMon %= 12;
	// 		total += days[nextMon];
	// 		nextMon++;
	// 	}
	// 	nextDay = days[nextMon-1] - (total - max);

	// 	System.out.printf("%d월 %d일입니다.\n", nextMon, nextDay);
	// }
}
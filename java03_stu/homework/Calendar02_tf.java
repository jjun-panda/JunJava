package java03_stu.homework;

import java.util.Scanner;
import static java.lang.System.*;
import java.io.PrintStream;

public class Calendar02_tf {
	static Scanner scan = new Scanner(System.in);
	static int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	static int month, day, nextMon, nextDay;
	static int total, max;
	// static int max = 100;
	
	public static final void print(String str) {
		out.print(str);
	}
	
	public static PrintStream printf(String format, Object ... args) {
		return java.lang.System.out.format(format, args);
	}

	public static void main(String[] args) {
		print("월/일 입력해주세요>> ");
		month = scan.nextInt();
		day = scan.nextInt();
		print("며칠 후의 날짜를 입력해주세요>> ");
		max = scan.nextInt();

		System.out.printf("%d월 %d일의 %d일 후는 ", month, day, max);

		total = days[month-1] - day;

		nextMon = month;
		while(total < max) {
			nextDay %= 12;
			total += days[nextMon];
			nextMon++;
		}
		nextDay = days[nextMon-1] - (total-max);

		System.out.printf("%d월 %d일 입니다.\n", nextMon, nextDay);
	}
}
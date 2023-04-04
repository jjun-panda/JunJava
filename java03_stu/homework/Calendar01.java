package java03_stu.homework;

import java.util.Scanner;

public class Calendar01 {
	int[] days = {31,28,31,30,31,30,31,31,30,31,30,31}; // 각 월에 해당되는 일
	Scanner scan = new Scanner(System.in);
	int month; //월 입력
	int day; // 일 입력
	int total = 0;

	public Calendar01(){
		day();
	}

	public void day() {
		System.out.print("월 입력>> ");
		month = scan.nextInt();
		System.out.print("일 입력>> ");
		day = scan.nextInt();
		
		// 배열은 0부터 시작하므로, 민액에 -1 적용하지 않을 경우 2월 입력시 배열에서 세번째에 해당되는 31로 적용된다.
		for(int i = 0; i < month-1; i++) { 
			total += days[i]; // 입력한 월에 따라 각각 일수를 더한다.
		}
		total += day; // 전월까지 각각 일수에서 당월 1일부터 지나간 일수까지 총 합산

		int lastDay, newDay;
		// 올해 12월 31일
		lastDay = 365 - total; 
		// 내년 1월 1일
		newDay = 365 - total + 1;

		System.out.printf("\"%d월%d일 기준\"은 올해 12월 31일까지 %d일 남았습니다.\n", month, day, lastDay);
		System.out.printf("\"%d월%d일 기준\"은 내년 1월 1일까지 %d일 남았습니다.", month, day, newDay);
	}

	public static void main(String[] args) {
		new Calendar01();
	}
}

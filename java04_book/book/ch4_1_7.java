package java04_book.book;

import java.util.Scanner;

class Day {
    private String work;
    public void set(String work) {
        this.work = work;
    }
    public String get() {
        return work;
    }
    public void show() {
        if(work == null) {
            System.out.println("없습니다.");
        } else {
            System.out.println(work + "입니다.");
        }
    }
}

class MonthSchedule {
    Scanner scan = new Scanner(System.in);
    Day[] days;
    int size;
    public MonthSchedule(int size) {
        this.size = size;
        this.days = new Day[size];
        for(int i = 0; i < size; i++) {
            this.days[i] = new Day();
        }
    }

    public void input() {
        System.out.println("-".repeat(10) + " 추가 " + "-".repeat(10));
        System.out.printf("날짜(1~%d)>> ", size);
        int day = scan.nextInt();
        System.out.print("할일(빈칸없이 입력)>> ");
        if(days[day-1] == null) {
            days[day-1] = new Day();
        }
        days[day-1].set(scan.next());
    }

    public void view() {
        System.out.println("-".repeat(10) + " 보기 " + "-".repeat(10));
        System.out.printf("날짜(1~%d)>> ", size);
        int day = scan.nextInt();
        System.out.print(day+"일의 할 일은 ");
        if(days[day-1] != null) {
            days[day-1].show();
        }else {
            System.out.println("없습니다.");
        }
    }

    public void finish() {
        System.out.println("-".repeat(10) + " 종료 " + "-".repeat(10));
        System.exit(0);
    }
    public void run() {
        System.out.println(":".repeat(5) + " 이번달 스케줄 관리 프로그램 " + ":".repeat(5));
        while(true) {
			System.out.println("\n[1]추가  [2]보기  [3]종료");
            System.out.print("해당 번호를 입력해주세요>> ");
            switch (scan.nextInt()) {
				case 1:
					input();
					break;
				case 2:
					view();
					break;
				case 3:
					finish();
					break;
				default:
					System.out.println(">>오 이런! 해당 번호가 존재하지 않습니다.");
					break;
			}
            System.out.println();
        }
    }
}
public class ch4_1_7 {
    public static void main(String[] args) {
        new MonthSchedule((30)).run();
        
    }
}

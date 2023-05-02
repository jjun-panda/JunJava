package java04_book.book;

import java.util.Scanner;

class Grade {
    private int math;
    private int science;
    private int engligh;
    Grade(int math, int science, int engligh) {
        this.math = math;
        this.science = science;
        this.engligh = engligh;
    }

    public int average() {
        return (math+science+engligh)/3;   
    }
}   

public class ch4_1_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>> ");
        int math = scanner.nextInt();
        int science = scanner.nextInt();
        int engligh = scanner.nextInt();
        Grade me = new Grade(math, science, engligh);
        System.out.println("평균은 " + me.average());

        scanner.close();
    }
}

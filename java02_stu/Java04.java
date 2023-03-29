
import java.util.Scanner;

public class Java04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int score = 0;
        String grade = "F";

        System.out.print("점수를 입력하세요(0~100): ");
        score = scan.nextInt();

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else if (score < 0 || score > 100) {
            grade = "오류";
        }

        int point = score % 10;

        if (score >= 60 && score < 100){
            if (point >= 7) {
                grade += "+";
            } else if (point <= 3) {
                grade += "-";
            }
        } else if (score == 100) {
            grade += "+";
        }

        System.out.println("당신의 성적은 " + score + "점이며, " + grade + "입니다.");
        scan.close();
    }
}
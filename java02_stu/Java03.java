
import java.util.Scanner;

public class Java03 {
    static Scanner abc = new Scanner(System.in);

    public static void main(String[] args) {

        int score = 0;
        String gra = "F";

        System.out.print("점수를 입력하세요(0~100): ");
        score = abc.nextInt();

        if (score<0 || score>100) {
            gra = "오류";
        } else if (score >= 90) {
            gra = "A";
        } else if (score >= 80) {
            gra = "B";
        } else if (score >= 70) {
            gra = "C";
        } else if (score >= 60) {
            gra = "D";
        }

        System.out.println("당신의 성적" + score + "는(은) " + gra + "입니다.");
        abc.close();
    }
}

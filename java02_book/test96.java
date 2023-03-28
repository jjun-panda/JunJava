import java.util.Scanner;

public class test96 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
      // 성적을 입력 받아서 학점을 출력하는 프로그램
    int score = 0;
    String grade = "F";
    String grade2 = " ";

        System.out.print("점수를 입력하세요(0~100): ");
        score = scan.nextInt();

        if (score<0 || score>100) {
            grade = "오류";
        } else if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        }

        int aa = score%10;
        if (score>=60 && score<100){
            if (aa >= 7) {
                grade2 = "+";
            } else if (aa <= 3) {
                grade2 = "-";
            } else {
                grade2 = " ";
            }
        } else if (score == 100) {
            grade2 = "+";
        }
        System.out.println("당신의 성적" + score + "점이며, " + grade + grade2 + "입니다.");
        scan.close();
    }
}

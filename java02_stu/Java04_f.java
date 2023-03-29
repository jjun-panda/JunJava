
import java.io.IOException;
import java.util.Scanner;

public class Java04_f {

    public static int getNum() throws IOException {
        int num = 0;
        int ch = 0;
        while((ch = System.in.read()) != '\n'){
            // '0' == 48
            // 만약 ch에 '1'이라면 49. 숫자 1로 바꾸려면 49 - '0'
            // 키로 입력 받은 아스키값을 숫자로 변환
            if(ch >= '0' && ch <= '9'){
                // ch가 문자 '0' ~ '9'사이만 처리 됨.
                //(num을 10의 자리로 바꾼다)
                // 90 + 7
                // 970 + 8
                // 먼저 입력된 숫자 자릿수 증가 + 현재 입력 된 숫자
                num = (num*10) + (ch-'0');
            }
        }
        return num;
    }
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int score = 0;
        String grade = "F";

        System.out.print("점수를 입력하세요(0~100): ");
        // score = scan.nextInt();
        score = getNum();

        while((100 < score) || (0 > score)) {
            System.out.print("점수입력 오류가 발생했습니다! 다시 입력해주세요(0~100): ");
            // score = scan.nextInt();
            score = getNum();
        }

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

        if (score >= 60){
            if (score == 100 || point >= 7) {
                grade += "+";
            } else if (point <= 3) {
                grade += "-";
            }
        }

        System.out.println("당신의 성적은 " + score + "점이며, " + grade + "입니다.");

        System.out.println("재시도하겠습니까?");
        System.out.println("Y 또는 N 입력해주세요.");
        String yn = scan.next();

        // 유효성검사
        while(!("y".equals(yn.toLowerCase()) || "n".equals(yn.toLowerCase()))) {
            System.out.println("입력 오류 발생했습니다. Y 또는 N 만 다시 입력해주세요.");
            yn = scan.next();
        }
        if ("y".equals(yn.toLowerCase())) {
            System.out.println("재실행하겠습니다.");
            main(args); // 재귀호출
        } else {
            System.out.println("프로그램 종료");
            System.out.println("수고하셨습니다!");
        }
        scan.close();
    }
}
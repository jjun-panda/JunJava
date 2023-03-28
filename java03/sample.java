package chapter02.ex12;

import java.util.Scanner;

public class Ch02Ex12 {
   // 같은 패키지의 같은 클래스에서만 사용되는 필드는 접근지정자 생략가능.
   static Scanner scan = new Scanner(System.in);
   
   public static void main(String[] args) {
      // 성적을 입력 받아서 학점을 출력하는 프로그램
      int score = 0;
      String grade = "F";
      
      System.out.print("점수입력: ");
      score = scan.nextInt();
      System.out.print(score+"점은 ");
      
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
      System.out.println(grade + "입니다.");
   }

}
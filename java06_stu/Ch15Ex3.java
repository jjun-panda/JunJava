package java06_stu;

import java.util.StringTokenizer;

public class Ch15Ex3 {
    public static void main(String[] args) {
        String str1 = "1|김코딩|프로그래머|29|부산시 해운대구 우동";

        // 문자열을 분해하기
        StringTokenizer strtkz = new StringTokenizer(str1, "|");
        while(strtkz.hasMoreTokens()){
            System.out.println(strtkz.nextToken());
        }
    }
}

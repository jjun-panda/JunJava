

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.System.out;

public class Java06 {
    public static void puts(String str) {
        System.out.println(str);
    }

    private static int getNum() {
        int num = 0;
        int ch=0;
        boolean flag = false;
        try {
            while((ch=System.in.read())!='\n') {
                if(ch >= '0' && ch <= '9') {
                    num = num*10; // 앞에 입력 숫자 자릿수 올리기
                    num += ch - '0'; // 현재 입력된 숫자 더하기
                    flag = true;
                }
            }
        } catch (IOException e) {}

        if(!flag) {
            puts("경고: 부적걸한 사용법입니다");
            puts("숫자를 입력해주세요.");
            puts("다시입력>> ");
            num = getNum(); // 재귀호출
        }
        return num;
    }

    public static PrintStream printf(String format, Object ... args) {
        return out.format(format, args);
    }

    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        // 월을 입력 받아서 해당 월은 몇일까지인지 출력한다.
        // Swutch~case로 출현
        // 2월 입력 시 28일까지 출력되도록
        int month = 0;
        int day = 31;
        
        puts("해당 월을 입력해주세요: ");
            month = getNum();

        while(!(1 <= month && 12 >= month)) {
            puts("해당 월은 존재하지 않습니다. 다시 입력해주세요.");
            month = getNum();
        }

        switch(month) {
            
            case 2: 
                day = 28; break;
            // case 4, 6, 9, 11 -> 스위프트 문법 != 자바
            case 4: case 6: case 9: case 11: 
                day = 30; break;
            // case 1, 3, 5, 7, 8, 10, 12: 
            //     day = 31; break;
            // default:
                // puts("해당 월은 존재하지 않습니다. 다시 입력해주세요.");
                // month = getNum();
        }
        // puts(month + "월 " + day + "일 입니다.");
        // printf는 print format
      // C언어의 출력함수 printf()와 사용법이 동일 함.
        System.out.printf("%d월은 %d일 입니다.", month, day);

    }

    public static void test01(String[] args) {
        puts("---- MENU ----\n");
        puts("1. INPUT 2.OUTPUT 3.SEARCH 4.FINISH");
        puts("Choice: ");
        int no = getNum();

        switch(no) { // 논리 값이 아닌 정수 또는 문자열 값을 입력한다.
            case 1: puts("#### 입력 기능 ####\n"); break;
            case 2: puts("#### 출력 기능 ####\n"); break;
            case 3: puts("#### 검색 기능 ####\n"); break;
            case 4: puts("#### 종료 기능 ####\n"); break;
            default: puts("#### 해당 사항 없음 ####\n");
        }
    }
}

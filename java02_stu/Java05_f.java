

import java.io.IOException;
import java.util.Scanner;

public class Java05_f {
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
        int a, b, c;
        int max=0, mid=0, min=0;

        System.out.print("정수 3개 입력: ");
        a = Java04_f.getNum();
        b = Java04_f.getNum();
        c = Java04_f.getNum();

        // 유효성 검사
        while(!(a != b && a != c && b != c)) {
            System.out.println("각각 다른 정수를 입력 하세요!");
            System.out.print("정수 3개 다시 입력: ");
            a = Java04_f.getNum();
            b = Java04_f.getNum();
            c = Java04_f.getNum();
         }

        if ((a > b) && (a > c)) {
            max = a;
            if ((b>c)){
                mid = b; min = c;
            } else {
                mid = c; min = b;
            }
        } else if ((b > c)) {
            max = b;
            if ((a > c)){
                mid = a; min = c;
            } else {
                mid = c; min = a;
            }
        } else {
            max = c;
            if ((a>b)){
                mid = a; min = b;
            } else {
                mid = b; min = a;
            }
        }
        System.out.printf("max=%d, mid=%d, min=%d\n", max, mid, min);

        scan.close();
    }
}
package java09_stu;

import static java.lang.System.*;

import java.io.IOException;

public class Ch20Ex02 {
    public static int getNum() {
        int num = 0;
        int ch = 0;
        try{
            while ((ch = System.in.read()) != '\n') {
                if(ch >= '0' && ch <= '9') {
                    num = num * 10 + ch - '0';
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return num;
    }
    public static void main(String[] args) {
        out.println("정수 입력: ");

        int number = getNum();

        out.println("입력 된 정수는 " + number);
        out.println(number + " * 10 = " + number*10);
    }
}

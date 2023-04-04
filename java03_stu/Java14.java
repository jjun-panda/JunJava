package java03_stu;

import java.util.Scanner;

public class Java14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("입력해주세요~");
        char ch = scan.next().charAt(0); // 문자열 입력

        for(char j = ch; j >= 'a'; j--){
            for(char i='a'; i<=j; i++) {
                System.out.print((char)i);
            }
            System.out.println();
        }
        scan.close();
    }
}

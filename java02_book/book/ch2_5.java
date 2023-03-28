import java.util.Scanner;

public class ch2_5 {
    public static void main(String[] args){
        Scanner side = new Scanner(System.in);

        System.out.println("정수 3개를 입력하시오>> ");
        int a = side.nextInt();
        int b = side.nextInt();
        int c = side.nextInt();

       if((a+b)>c && (a+c)>b && (b+c)>a) {
        System.out.println("삼각형이 됩니다.");
       } else {
        System.out.println("삼각형이 아닙니다.");
       }

        side.close();
    }
}
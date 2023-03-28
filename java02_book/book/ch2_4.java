import java.util.Scanner;

public class ch2_4 {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);

        System.out.print("정수 3개 입력>>");
        int a = number.nextInt();
        int b = number.nextInt();
        int c = number.nextInt();

        if(a!=b && b!=c && c!=a) { // 입력받은 값이 서로 다른 3개의 정수일 때
            if (b < a && a < c) System.out.println("중간값은 " + a);
            else if (a < b && b < c) System.out.println("중간값은 " + b);
            else System.out.println("중간값은 " + c);
        } else { // 입력받은 값 중에 서로 같은 정수가 있는 경우
            if (a == b) System.out.println("중간값은 " + a);
            else if (b == c) System.out.println("중간값은 " + b);
            else System.out.println("중간값은 " + c);
        }

        number.close();
    }
}
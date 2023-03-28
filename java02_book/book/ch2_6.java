import java.util.Scanner;

public class ch2_6 {
    public static void main(String[] args){
        Scanner number = new Scanner(System.in);

        System.out.println("1~99 사이의 정수를 입력하시오>>");
        int a = number.nextInt();
        int count = 0;
       
        if  ((a%10 == 3) || (a%10 == 6) || (a%10 == 9)) {
            count += 1;
        }
        if  ((a/10 == 3) || (a/10 == 6) || (a/10 == 9)) {
            count += 1;
        }

        if(count == 1) {
        System.out.println("박수짝");
       } else if(count == 2) {
        System.out.println("박수짝짝");
       } else {
        System.out.println(a);
    }

        number.close();
    }
}
import java.util.Scanner;

public class test95_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a, b, c;
        int max=0, mid=0, min=0;

        System.out.print("정수 3개 입력: ");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();

        max = (a > b)? a : b;
        max = (max > c)? max : c;

        min = (a < b)? a : b;
        min = (min < c)? min : c;

        // if (a == max) {
        //     mid = (b > c)? b : c;
        // } else if (b == max) {
        //     mid = (a > c)? a : c;
        // } else if (c == max) {
        //     mid = (a > b)? a : b;
        // }

        if (a == min) {
            mid = (b < c)? b : c;
        } else if (b == min) {
            mid = (a < c)? a : c;
        } else if (c == min) {
            mid = (a < b)? a : b;
        }

        System.out.printf("max=%d, mid=%d, min=%d\n", max, mid, min);

        scan.close();
    }
}

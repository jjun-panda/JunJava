import java.util.Scanner;

public class Number {
	public static void main(String [] args) {
    	Scanner number = new Scanner(System.in);        
        System.out.print("2자리수 정수 입력(10~99)>> ");
        int num = number.nextInt();
        
        if (num>9 && num<100) {
            int a = num/10;
            int b = num%10;

            if(a == b)
                System.out.println("Yes! 10의 자리와 1의 자리가 같습니다.");
            else
                System.out.println("No! 10의 자리와 1의 자리가 다릅니다.");
        } else {
            System.out.println("10 이상 또는 100 이하로 입력해주세요");
        }
        number.close();
    }
}
import java.util.Scanner;

public class Money {
	public static void main(String [] args) {
    	Scanner money = new Scanner(System.in);
        
        float dollar;
        System.out.print("원화를 입력하세요(단위 원)>> ");
        int won = money.nextInt();
        dollar = (float)won/1100;
        
        System.out.println(won +"원은 $" + dollar + "입니다." );
        money.close();
    }
}
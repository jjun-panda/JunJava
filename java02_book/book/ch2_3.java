import java.util.Scanner;

public class ch2_3 {
    public static void main(String[]args) {
        int num; //지폐의 장수 또는 동전의 개수

        Scanner cash = new Scanner(System.in);
        System.out.print("금액을 입력하시오>>");
        int money = cash.nextInt();

        num = money/50000;
        money%=50000;
        if(num>0)   System.out.println("오만원권 "+num+"매");

        num = money/10000;
        money%=10000;
        if(num>0)   System.out.println("만원권 "+num+"매");

        num = money/1000;
        money%=10000;
        if(num>0)   System.out.println("천원권 "+num+"매");

        num = money/500;
        money%=500;
        if(num>0)   System.out.println("오백원 "+num+"개");

        num = money/100;
        money%=100;
        if(num>0)   System.out.println("백원 "+num+"개");

        num = money/50;
        money%=50;
        if(num>0)   System.out.println("오십원 "+num+"개");

        num = money/10;
        money%=10;
        if(num>0)   System.out.println("십원 "+num+"개");

        num = money;
        if(num>0)   System.out.println("일원 "+num+"개");

        cash.close();
    }
}

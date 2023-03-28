import java.util.Scanner;

public class ch2_10 {
    public static void main(String[] args){
        Scanner circle = new Scanner(System.in);

        System.out.println("첫번째 원의 중심과 반지름 입력>>");
        double x1 = circle.nextDouble();
        double x2 = circle.nextDouble();
        double r1 = circle.nextDouble();

        System.out.println("두번째 원의 중심과 반지름 입력>>");
        double y1 = circle.nextDouble();
        double y2 = circle.nextDouble();
        double r2 = circle.nextDouble();
        
        double num = Math.sqrt((y1-x1)*(y1-x2)+(y2-x2)*(y2-x2));
        if(num < (r1+r2)) {
            System.out.println("두 원은 서로 겹친다.");
        } else {
            System.out.println("두 원은 서로 겹치지 않는다.");
        }
        circle.close();
    }
}
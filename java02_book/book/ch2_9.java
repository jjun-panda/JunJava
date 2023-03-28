import java.util.Scanner;

public class ch2_9 {
    public static void main(String[] args){
        Scanner circle = new Scanner(System.in);

        System.out.println("원의 중심과 반지름 입력>>");
        // c1 = 원의 중심 x
        // c2 = 원의 중심 y
        // r = 반지름
        double c1 = circle.nextDouble();
        double c2 = circle.nextDouble();
        double r = circle.nextDouble();

        System.out.println("점 입력>>");
        double x = circle.nextDouble();
        double y = circle.nextDouble();
        
        double num = Math.sqrt((x-c1)*(x-c1)+(y-c2)*(y-c2));
        if(num < r) {
            System.out.println("점 (" + x + "," + y + ")는 원 안에 있다.");
        } else {
            System.out.println("점 (" + x + "," + y + ")는 원 밖에 있다.");
        }
        circle.close();
    }
}
import java.util.Scanner;

public class ch2_8 {
    public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else return false;
	}	//책에서 제시한 메소드
    public static void main(String[] args){
        Scanner point = new Scanner(System.in);

        System.out.println("첫번째 좌표를 입력하시오>>");
        int x1 = point.nextInt();
        int x2 = point.nextInt();

        System.out.println("두번째 좌표를 입력하시오>>");
        int y1 = point.nextInt();
        int y2 = point.nextInt();
        
        if(((x1>=100) && (x1<=200)) && ((y1>=100) && (y1<=200)) && ((x2>=100) && (x2<=200)) && ((y2>=100) && (y2<=200))){
            System.out.println("직사각형과 겹칩니다.");
        } else {
            System.out.println("직사각형과 겹치지 않습니다.");
        }
        point.close();
    }
}
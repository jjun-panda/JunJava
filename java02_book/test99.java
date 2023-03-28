
import java.util.Scanner;

public class test99 {
	
    public static Scanner scan;

	public static void main(String[] args) {

		double r = .0;
		double area = .0; // 면적
		double line = .0; // 둘레길이
		
		final double pi = Math.PI;
		
		// r = 30;
		System.out.print("반지름을 입력해주세요 : ");
		r = scan.nextInt();
        area = r*r*pi;
        line = 2*pi*r;
		
		System.out.println("둘레길이: " + line);
        System.out.println("넓이: " + area);

	}

}
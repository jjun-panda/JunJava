

import java.util.Scanner;

public class Java02 {
	
    public static Scanner scan;

	public static void main(String[] args) {
		// Scanner scan = new Scanner(System.in);

		double w = .0;
		double h = .0;
		double area = .0;

		System.out.print("가로 입력 : ");
		w = scan.nextDouble();
		System.out.print("세로 입력 : ");
		h = scan.nextDouble();

        area = w*h/2;
		
		System.out.println("삼각형의 면적: " + area);

		scan.close();


	}

}
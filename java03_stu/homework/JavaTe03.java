package java03_stu.homework;
import java.util.Scanner;

public class JavaTe03 {
	public static void main(String[] args) {
		Scanner math = new Scanner(System.in);

		int n = 0;
		int numA = 0;
		int numB = 2; 
		// 1안.임의 숫자 적용 
		// final int max = 10;

		// 2안.n까지 합친 값을 확인하기 위한 입력용
		int max;
		System.out.print("입력 해주세요: ");
		max = math.nextInt();
		
		for(n = 1; n <=max; n++) {
			if(n%2 == 0){ // 홀수
				System.out.print(n);
				numA += n;
				
				if(n < max) {
					System.out.print("-");
				}
			} else { // 짝수
				System.out.print(n);
				numB -= n;
				
				if(n < max) {
					System.out.print("+");
				}
			}
		}
		int total = numA + numB;
		System.out.print("=" + total);
		math.close();
	}
}
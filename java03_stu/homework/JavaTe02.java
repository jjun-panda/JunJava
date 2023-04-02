package java03_stu.homework;
import java.util.Scanner;

public class JavaTe02 {
	public static void main(String[] args) {
		Scanner math = new Scanner(System.in);
		int n1 = 1;
		int n2 = 0;
		int n3 = 1;
		int numA = 0;
		int numB = 2; // 1부터 시작하므로 계산에서는 처음으로부터 3번째
		
		// 1안.임의 숫자 적용 
		// final int number = 8;
		
		// 2안.n까지 합친 값을 확인하기 위한 입력용
		int number;
		System.out.print("입력 해주세요: ");
		number = math.nextInt();
		
		for(int n = 1; n <=number; n++) {
			n3 = n1 + n2;

			if(n%2 == 0){ // 홀수
				System.out.print(n3);
				n1 = n2;
				n2 = n3;
				numA += n2;
				
				if(n < number) {
					System.out.print("-");
				}
			} else { // 짝수
				System.out.print(n3);
				n1 = n2;
				n2 = n3;
				numB -= n2;
				
				if(n < number) {
					System.out.print("+");
				}
			}
		}
		int total = numA + numB;
		System.out.print("=" + total);
		math.close();
	}
}
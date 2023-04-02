package java03_stu.star;
import java.util.Scanner;

// 행의 수: 8
// *
// **
// ***
// ****
// *****
// ******
// *******
// ********

public class Star09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("행의 수(홀수만): ");
		int size = scan.nextInt();
		while(size%2 == 0){
			System.out.print("짝수를 입력하셨네요!\n홀수만 입력해주세요>>");
			size = scan.nextInt();
		}
		for(int i=0; i<size; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		scan.close();
	}
}

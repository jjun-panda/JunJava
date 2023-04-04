package java03_book.book;

import java.util.Scanner;

public class ch3_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System. in);
		int num[] = new int[10]; // 배열 10개

		// 배결에 10개의 정수 입력
		System.out.print("양의 정수 10개를 입력하시오>> ");
		for (int i = 0; i < 10; i++) {
			num[i] = scan.nextInt();

			// 0은 3의 배수가 아니므로 제외
			if (num[i] % 3 == 0 && num[i] != 0) {
				
				System.out.print(num[i] + " ");
			}
		}
		scan.close();
	}
}

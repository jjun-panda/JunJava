package java03_book.book;

import java.util.Scanner;

public class ch3_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수를 입력하시오>> ");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = n; j >= i + 1; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		scan.close();
	}
}

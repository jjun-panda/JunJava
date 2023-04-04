package java03_book.book;

import java.util.Scanner;

public class ch3_6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System. in);
		int won = 0;

		System.out.print("금액을 입력하세요 >> ");
		int money = scan.nextInt();

		int util[] = {50000, 10000, 1000, 100, 10, 1}; // 환산할 돈의 종류

		for (int i = 0; i < util.length; i++) {
			won = (int)money / util[i]; // 입력한 값을 배열에 대입해서 계산
			money %= util[i]; // 대입 후 나머지를 하위 배열에서 계산
			System.out.println(util[i] + "원 짜리 : " + won + "개");
		}
		scan.close();
	}
}

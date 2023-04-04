package java03_book.book;

import java.util.Scanner;

public class ch3_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("소문자 알파벳 하나를 입력하시오>> ");
		String n = scan.next();
		// (0)은 문자열 첫번째 문자
		char c = n.charAt(0);	// 문자열에서 인자로 주어진 값에 해당하는 문자를 리턴

		if(c < 'a' || c > 'z'){
			System.out.println("잘못된 입력입니다. 다시 입력하시오");
		} else{
			for (int i = c; i >= 'a'; i--) {
				for (char j = 'a'; j <= i; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}
		scan.close();
	}
}

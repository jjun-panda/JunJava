// 1   2   3   4   5
//     4   5   6
//         7
//     8   9   10
// 11  12  13  14  15

package java04_stu.homework;

import java.util.Random;
import java.util.Scanner;

public class java_04_2 {
	public static void main(String[] args) {      
		int lotto[] = new int[6];
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int game;
		System.out.print("몇 게임 하시겠어요>> ");
		game = scan.nextInt();

		for(int l = 1; l <= game; l++){
			// 랜덤번호 생성
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = random.nextInt(45) + 1; 
				// 중복번호 제거
				for(int j = 0; j < i; j++) {
					if(lotto[i] == lotto[j]) {
						i--;
						break;
					} 
				}
			}
			// 랜덤번호 출력
			System.out.print(l + "게임 예상 로또번호: ");
			for (int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i] + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}


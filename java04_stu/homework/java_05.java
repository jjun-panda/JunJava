package java04_stu.homework;

import java.util.Random;

public class java_05 {
	public static void main(String[] args) {      
		int lotto[] = new int[6];
		Random random = new Random();

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
		System.out.print("이번 로또번호: ");
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}


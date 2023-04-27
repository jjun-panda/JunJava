package java04_stu;
import java.util.Random;


public class Ch04Homework {
	public static final int SIZE = 6;
	public static final int MAX = 6;
	public static final Random rand = new Random();

	public static void main(String[] args) {
		// 로또 번호를 저장할 배열 선언
		int lotto[] = new int[SIZE];

		// 제어문만 이용해서 로또번호 생성(번호 중복 X)
		int idx = 0;
		while (idx < SIZE) {
			lotto[idx] = rand.nextInt(MAX) + 1;

			for(int k = 0; k < idx; k++) {
				if(lotto[idx] == lotto[k]) {
					idx--;
					break;
				}
			}
			idx ++;
		}
		// 배열에 저장된 요소 값 확인
		for(int i = 0; i < SIZE; i++) {
			System.out.printf("%d\t", lotto[i]);
		}
	}
}

package java04_stu;
import java.util.Arrays;
import java.util.Random;


public class Ch04Homework2 {
	public static final int SIZE = 6;
	public static final int MAX = 6;
	public static final Random rand = new Random();

	public static void main(String[] args) {
		// 로또 번호를 저장할 배열 선언
		int lotto[] = new int[SIZE];

		for(int i=0; i<SIZE; i++) {
			int number = rand.nextInt(MAX) + 1;
			// 중복 있나 없나 비교
			boolean flag = true;
			for(int j=0; j<i; j++) {
				// number와 lotto 배열의 j번째 비교
				if(number == lotto[j]){
					flag = false;
					break;
				}
			}
			if(flag) {
				// 중복 없다면 입력
				lotto[i] = number;
				i++;
			}
		}

		Arrays.sort(lotto);
		System.out.println(Arrays.toString(lotto));
	}
}

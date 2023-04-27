package java04_stu;
import java.util.Arrays;
import java.util.Random;


public class Ch04Homework3 {
	public static final int SIZE = 6;
	public static final int MAX = 6;
	public static final Random rand = new Random();

	public static void main(String[] args) {
		// 로또 번호를 저장할 배열 선언
		int lotto[] = new int[SIZE];

		for(int i=0; i<SIZE; i++) {
			lotto[i] = rand.nextInt(MAX) + 1;
			// 중복 있나 없나 비교
			for(int j=0; j<i; j++) {
				// 1안
				// if(lotto[i] == lotto[j]){
				// 	lotto[i] = rand.nextInt(MAX) + 1;
				// 	i--;
				// 	break;
				// }

				// 2안
				// if(lotto[i] == lotto[j]){
				// 	lotto[i] = rand.nextInt(MAX) + 1;
				// 	i=0;
				// 	break;
				// }

				// 3안
				if(lotto[i] == lotto[j]){
					lotto[i] = rand.nextInt(MAX) + 1;
					j = -1;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	}
}

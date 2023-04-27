package java04_stu;
import java.util.Arrays;

public class Ch04Homework4 {
	public static final int SIZE = 6;
	public static final int MAX = 45;
	public static final int[] lotto = new int[SIZE];
	public static final int[] ball = new int[MAX];
	static {
		// start 초기화 블럭(생성자보다 먼저 실행되는 부분)
		for(int num=1; num<=MAX; num++) {
			ball[num-1] = num;
		}
	}
	public static void main(String[] args) {
		Random rand = new Random();
		// ball의 랜덤한 위치에서 num을 뽑아온다.
		// 6번 반복
		// 한번 뽑은 위치는 0으로 표시한다.
		for (int i = 0; i < SIZE;  i ++) {
			int idx = rand.nextInt(MAX);
			lotto[i] = ball[idx];
			ball[idx] = 0;

			if(lotto[i] == ball[idx]) {
				i--;
				break;
			}
			// for(int k = 0; k < idx; k++) {
				// if(lotto[i] == ball[idx]) {
				// 	i++;
				// 	break;
				// }
			// }
		}
		System.out.println(Arrays.toString(lotto));
		System.out.println(Arrays.toString(ball));
	}
}

package java03_stu;

import java.io.PrintStream;

// 구구단
public class Java12_1 {

	public PrintStream printf(String format, Object ...args) {
		return System.out.format(format, args);
	}

	public Java12_1() {
		for (int cnt = 2; cnt < 10; cnt++) {
			for(int dan=2; dan<=9; dan++) {
				gugudan(dan);
			}
		}
	}

	public void gugudan(int num) {
		printf("--%d단--\n", num);
		for (int cnt = 1; cnt < 10; cnt++) {
			printf("%d*%d=%d\n", num, cnt, num * cnt);
			// System.out.print("\t");
		}
	}

	public static void main(String[] args) {
		//구구단 출력
		new Java12_1();
	}
}
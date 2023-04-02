package java03_stu.star;

// *********
// *  * *  *
// * *   * *
// **     **
// *       *
// **     **
// * *   * *
// *  * *  *
// *********

public class Star13_1 {
	public static void main(String[] args) {
		final int size = 9;                     // 패턴 크기 설정
		for (int i = 0; i < size; i++) {        // 세로(행)
			for (int j = 0; j < size; j++) {    // 가로(열)
				if (i == 0 || j == 0 || i == size - 1 || j == size - 1) {
					System.out.print("*");      // 별 출력
				} else if ((i == 4 - j) || (j == -4 + i)) {
					System.out.print("*");      // 별 출력
				} else if ((i == 12 - j) || (j == 4 + i)) {
					System.out.print("*");      // 별 출력
				} else {
					System.out.print(" ");      // 공백 출력
				}
			}
			System.out.println(); // 줄바꿈
		}
	}
}

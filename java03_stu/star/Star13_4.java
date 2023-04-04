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

public class Star13_4 {
	public static void main(String[] args) {
		final int size = 9;                     // 패턴 크기 설정
		for (int i = 0; i < size*2; i++) {        // 세로(행)
			for (int j = 0; j < size*2; j++) {    // 가로(열)
				if (i == 0 || j == 0 || i == size*2 - 1 || j == size*2 - 1) {
					System.out.print("*");      // 별 출력
				} else if ((i == j + 8) || (j == - i)) {
					System.out.print("*");      // 별 출력
				} else if ((i == j) || (j == 8 - i)) {
					System.out.print("*");      // 별 출력
				} else if ((i == j - 8) || (j == 16 - i)) {
					System.out.print("*");      // 별 출력
				} else if ((i == j - 16) || (j == 24 - i)) {
					System.out.print("*");      // 별 출력
				} else {
					System.out.print(" ");      // 공백 출력
				}
			}
			System.out.println(); // 줄바꿈
		}
	}
}

package java03_stu.star;

// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

public class Star06 {
	public static void main(String[] args) {
		final int MAX = 9;
		int end = 1;
		for (int i = 0; i < MAX; i++) {
			for (int k = 0; k < end; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
			end = i < 4? end + 1: end - 1;
		}
	}
}

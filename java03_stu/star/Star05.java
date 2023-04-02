package java03_stu.star;

// *****
//  ****
//   ***
//    **
//     *

public class Star05 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			for (int k = 1; k < i + 1; k++) {
				System.out.print(" ");
			}
			for (int j = 5; j >= i + 1; j--) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}

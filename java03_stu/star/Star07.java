package java03_stu.star;

//     *
//    **
//   ***
//  ****
// *****
//  ****
//   ***
//    **
//     *

public class Star07 {
	// public static void main(String[] args) {
	// 	final int MAX = 9;
	// 	int end = 1;
	// 	for (int i = 0; i < MAX; i++) {
	// 		for (int j = 4; j >= end; j--) {
	// 			System.out.print(" ");
	// 		}
	// 		for (int k = 0; k < end; k++) {
	// 			System.out.print("*");
	// 		}
	// 		System.out.print("\n");
	// 		end = i < 4? end + 1: end - 1;
	// 	}
	// }

	// 응용
	public static void main(String[] args) {
		int end = 4;
		for(int i=0; i<9; i++) {
			System.out.print( end + " ");
			for(int j=0; j<5; j++) {
				System.out.print(j<end ? " " : j);
			}
			System.out.println(" " + i);
			end = i<4 ? end-1 : end+1;
		}
	}
}

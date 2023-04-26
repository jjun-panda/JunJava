// *********
//  *******
//   *****
//    ***
//     *
//    ***
//   *****
//  *******
// *********

package java04_stu.homework;

public class java_01 {
	public static void main(String[] args) {
		// 1안
		for(int i=4; i>=1; i--) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 2안
		// for(int i=0; i<9; i++) {
		// 	int max = i < 5 ? i : 8-i;
		// 	int k = 5 - max;
		// 	for(int j=0; j<=max*2-j-1; j++) {
		// 		System.out.print(" ");
		// 	}
		// 	for(int j=0; j<2*k-1; j++) {
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }
	}
}


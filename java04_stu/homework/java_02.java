// *********
// **** ****
// ***   ***
// **     **
// *       *

package java04_stu.homework;

public class java_02 {
	public static void main(String[] args) {
		// 1안
		for(int i=0; i<5; i++) {
			for(int j=0; j<9; j++) {
				if (i == 0 || j <= 4-i || j >= 4+i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// // 2안
		// for(int i=0; i<5; i++) {
		// 	int k=0, d=0;
		// 	if(i<5) {
		// 		k=5-i; d=4+i;
		// 	}
		// 	for(int j=0; j<9; j++) {
		// 		if(j>=k && j<d) {
		// 			System.out.print(" ");
		// 		} else {					
		// 			System.out.print("*");
		// 		}
		// 	}
		// 	System.out.println();
		// }

		// // 3안
		// for(int i=0; i<5; i++) {
		// 	for(int j=0; j<5-i; j++) {
		// 		if(i == 0 && j == 4) {
		// 			System.out.print("");
		// 		}
		// 		else {
		// 			System.out.print("*");
		// 		}
		// 	}
		// 	for(int j=0; j<i*2-1; j++) {
		// 		System.out.print(" ");
		// 	}
		// 	for(int j=0; j<5-i; j++) {
		// 		System.out.print("*");
		// 	}
		// 	System.out.println();
		// }
	}
}
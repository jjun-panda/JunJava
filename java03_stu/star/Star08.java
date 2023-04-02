package java03_stu.star;

//     *
//    ***
//   *****
//  *******
// *********

public class Star08 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<4-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

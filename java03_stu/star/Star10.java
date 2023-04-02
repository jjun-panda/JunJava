package java03_stu.star;

// *********
// **      *
// * *     *
// *  *    *
// *   *   *
// *    *  *
// *     * *
// *      **
// *********

public class Star10 {
	public static void main(String[] args) {
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				if(j>0 && j<8 && i!=0 && i!=8 && j!=i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

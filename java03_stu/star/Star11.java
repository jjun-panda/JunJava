package java03_stu.star;

// *********
// **** ****
// ***   ***
// **     **
// *       *
// **     **
// ***   ***
// **** ****
// *********

// 1. 9행9열로 별 출력.
// 2. 각행의 공백이 시작하는 열과 공백이 끝나는 열을 찾는다.
// 3. 패턴을 찾는다.

public class Star11 {
	public static void main(String[] args) {
		for(int i=0; i<9; i++) {
			int s=0, e=0;
			if(i<4) {
				s=5-i; e=4+i;
			} else {
				s=i-3; e=9-(i-3); 
			}
			for(int j=0; j<9; j++) {
				if(j>=s && j<e) {
					System.out.print(" ");
				} else {					
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}

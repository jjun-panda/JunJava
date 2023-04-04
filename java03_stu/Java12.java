package java03_stu;


public class Java12 {
	public static void main(String[] args) {
		int num = 1;
		System.out.println("구구단을 외워볼까?");

		for(num = 1; num < 19; num++) {
			for(int j = 1; j < 10; j++) {
				System.out.print(num+"*"+j+"="+num*j);
				System.out.print("\t");
			}
			System.out.println();
		}
	}
}

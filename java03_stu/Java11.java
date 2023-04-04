package java03_stu;

import java.util.Scanner;

public class Java11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);


		final int size = 9;
		int scale;
		// System.out.print("행의 수를 입력해주세요: ");
		// size = scan.nextInt();
		System.out.print("열의 수를 입력해주세요: ");
		scale = scan.nextInt();

		boolean flag = true;
		for(int k = 0; k < scale; k++) {
			int cnt = 2;
			int i = 1;
			if(flag) {
				cnt = 1; i = 0;
				flag = false;
			}
			for (; i < size; i++) {
				for(int l = 0; l < scale; l++){}
					for(int j = 0; j < size; j++) {
						boolean ccc = j==5-cnt || j==3+cnt;
						ccc = ccc || j == 0 || j == 8;
						ccc = ccc || i == 0 || i == 8;
						System.out.print(ccc?"*":" ");
					}
				}
				System.out.println();
				cnt = i<4 ? cnt+1 : cnt-1;
			}
			scan.close();
		}
	}

package java03_stu;

import java.io.IOException;

public class Java10 {
	private static int getNum() {
		int num = 0;
		int ch = 0;

		try {
			while ((ch = System. in.read()) != '\n') {
				if (ch >= '0' && ch <= '9') {
					num = num * 10 + ch - '0';
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return num;
	}

	public static void main(String[] args) {
		int cnt = 1;
		System.out.print("Input Size: ");
		int size = getNum();
		for (int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				System.out.print(j>size/2-cnt && j<size/2+cnt?"*":" ");
			}
			System.out.println();
			cnt = i<size/2? cnt+1 : cnt-1;
		}
	}
}

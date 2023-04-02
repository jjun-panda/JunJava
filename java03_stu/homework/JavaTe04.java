package java03_stu.homework;

public class JavaTe04 {
	public static void main(String[] args) {
		final int MAX = 21;
		int total = 2;
		int p = 0;  // 이전항
		int c = 1;  // 현재항
		int n;  // 다음항
		boolean flag = true;
		
		while(c <= MAX) {
			System.out.print(c);
			
			if(flag) {
				total -= c;
				System.out.print(c == MAX ? "=": "+");
				flag = false;
			} else {
				total += c;
				System.out.print(c == MAX ? "=": "-");
				flag = true;
			}
			n = c + p;
			p = c;
			c = n;
		}
	System.out.println(total);
	}
}
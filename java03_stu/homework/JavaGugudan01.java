package java03_stu.homework;

public class JavaGugudan01 {

	public JavaGugudan01() {
		int dan = 2; // 2단 부터 시작 
		while(dan <= 9){
			dan(dan); // n단을 출력
			System.out.println(); // 줄 바꿈
			cnt(dan); // n단 * 1~9까지 출력
			System.out.println(); // 줄 바꿈
			dan += 3; // 한줄에 3단씩 노출되므로 3씩 띄워두기
		}
	}

	public void dan(int num) {
		for (int n = 0; n < 3; n++) { // num에 n만큼 더해야함(ex. 5단 시작으로 5,6,7단까지 한줄로 노출)
			System.out.print(num+n < 10? (num+n)+"단***\t\t":""); // 10단 이상일 경우 출력X
		}
	}

	public void cnt(int num) {
		int cnt;
		for(cnt = 1; cnt <= 9; cnt++) { // n단에서 최소범위와 최대범위를 곱할 숫자값(1~9) 
			for (int n = 0; n < 3; n++) {
				System.out.print(num+n < 10? (num+n) + "*" + cnt + "=" + ((num+n)*cnt) + "\t\t" : "");
			} // 10단 이상일 경우 미출력, 2~9단까지 출력, 처음에 int dan에서 2로 설정했기 때문에 1단은 나올 수 없음
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new JavaGugudan01();
	}
}
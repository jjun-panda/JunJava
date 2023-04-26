package java03_stu.homework;

import java.util.Scanner;

public class JavaGugudan02 {
	Scanner scan = new Scanner(System. in);

	int min, max;

	public void nextInput() {
		System.out.print("시작 할 단 입력 >> ");
		min = scan.nextInt();
		System.out.print("종료 할 단 입력 >> ");
		max = scan.nextInt();
    }

	public JavaGugudan02() {
		nextInput();

		// if(min > max){
		// 	int tmp = min;
		// 	min = max;
		// 	max = tmp;
		// } 

		while (min == max) {
			System.out.printf("입력한 값이 같으며, \"%d단\" 결과만 노출 될 수 있습니다. \n그래도 진행하시겠습니까?(y/n) >> ", max);
			char yn = scan.next().charAt(0);
			while(!(yn=='y' || yn=='n')) {
				System.out.print("'y' 또는 'n'만 입력 해주세요 >>");
				yn = scan.next().charAt(0);
			}
			
			if(yn == 'n') {
				nextInput();
			} else if(yn == 'y') {
				break;
			}
		}
		System.out.println();

		int dan = min; // 사용자가 입력한 min값 부터 시작
		while(dan <= max){
			dan(dan); // n단을 출력
			System.out.println(); // 줄 바꿈
			cnt(dan); // n단 * 1~9까지 출력
			System.out.println(); // 줄 바꿈
			dan += 3; // 한줄에 3단씩 노출되므로 3씩 띄워두기
		}
	}


	public void dan(int num) {
		for (int n = 0; n < 3; n++) { // 3행, num에 n만큼 더해야함(ex. 5단 시작으로 5,6,7단까지 한줄로 노출)
			System.out.print(num+n <= max? (num+n)+"단***\t\t":""); // 10단 이상일 경우 출력X
		}
	}

	public void cnt(int num) {
		int cnt;
		for(cnt = 1; cnt <= 9; cnt++) { // n단에서 최소범위와 최대범위를 곱할 숫자값(1~9) 
			for (int n = 0; n < 3; n++) { // 3행
				System.out.print(num+n <= max? (num+n) + "*" + cnt + "=" + ((num+n)*cnt) + "\t\t" : "");
			} // 사용자가 입력한 max 값 이상일 경우 미출력, 2~9단까지 출력, 처음에 int dan에서 2로 설정했기 때문에 1단은 나올 수 없음
			System.out.println(); // for문에서 N*1 시작 후 줄바꿤, 리턴해서 N*2 순으로 반복 진행
		}
	}

	public static void main(String[] args) {
		new JavaGugudan02();
	}
}
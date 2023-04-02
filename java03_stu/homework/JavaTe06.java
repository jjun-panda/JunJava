package java03_stu.homework;

import java.util.Random;
import java.util.Scanner;

public class JavaTe06 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner scan = new Scanner(System.in);

		while(true) {
			int min = 0;
			int max = 99;	// 0~99까지 임의의 수
			int k = r.nextInt(100); // 임의의 정수 랜덤 생성
			int cut = 1; // 사용자가 시도한 번째

			System.out.println("수를 결정하였습니다. 맞추어 보세요");

			while(true) { // cut(카운드)는 재시도시 횟수마다 1씩 증가 적용
				System.out.printf("%d-%d\n" + cut + ">>", min, max); // 힌트, 입력할 범위
				int num = scan.nextInt(); // 사용자가 입력

				if(k > num) {
					System.out.println("더 높게");
					min = num;
				} else if(k < num) {
					System.out.println("더 낮게");
					max = num;
				} else {
					System.out.println("맞았습니다.");
					break;
				}
				cut++; // 사용자가 입력 후 정답이 아니라면 카운드 1씩 증가
			}
			System.out.print("다시하시겠습니까(y/n)>>");
			String choose;
			choose = scan.next();

			if(choose.equals("n")) {
				break; // 중단
			} else {
				continue; // 계속 진행
			}
		}
		scan.close();
	}
}
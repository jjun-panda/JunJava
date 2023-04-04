package java03_stu;

import java.util.Scanner;

public class Java12_2 {
	Scanner scan = new Scanner(System.in);
	
	public Java12_2() {
		ex01();
	}
	
	public void ex01() {
		int startDan=2, endDan=9; // 시작단, 종료단
		System.out.print("시작 할 단 입력: ");
		startDan = scan.nextInt();
		System.out.print("종료 할 단 입력: ");
		endDan = scan.nextInt();
		
		// 과제 1 : 구구단 3행 3열로 출력 되도록 하기
		// (힌트 : 제목만 출력 되는 걸 먼저 만들어 본다)
		// 과제 2 : 시작단, 종료단 입력 해서 3행 3열 적용
		
		// startDan > endDan 이 경우에도 정상 출력 되도록 하라.
		// 2분 
		// 힌트 swap 알고리즘
		if(startDan > endDan) {
			int tmp = startDan;
			startDan = endDan;
			endDan = tmp;
		}
		
		for(int cnt=1; cnt<=9; cnt++) {
			for(int dan=startDan; dan<=endDan; dan++) {
				System.out.format("%d*%d=%d\t", dan, cnt, dan*cnt);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Java12_2();
	}
}
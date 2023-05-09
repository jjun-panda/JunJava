package java05_book.CH09;

import java.util.Scanner;

public class StackApp implements Stack {
	public static final Scanner scan = new Scanner(System.in);
	
	String[] arr;
	int top = 0;
	int capacity;
	
	public StackApp(int capacity) {
		this.capacity = capacity;
		arr = new String[capacity];
	}

	@Override
	public int length() {
		// 현재 저장 된 요소의 갯수
		return top;
	}

	@Override
	public int capacity() {
		// 배열의 전체 크기
		return arr.length;
	}

	@Override
	public String pop() {
		if(top <= 0) {
			//System.out.println("스택이 비었습니다.");
			return null;
		}
		return arr[--top];
	}

	@Override
	public boolean pusy(String val) {
		if(top>=capacity) {
			System.out.println("스택이 꽉 찼습니다. 푸시 불가능!");
			return false;
		}
		arr[top++] = val;
		return true;
	}

	public static void main(String[] args) {
		System.out.print("총 스택 저장 공간의 크기 입력 >> ");
		int size = scan.nextInt();
		StackApp stackApp = new StackApp(size);
		for(;;) {
			System.out.print("문자열 입력 >> ");
			String val = scan.next();
			if("그만".equals(val)) {
				break;
			}
			stackApp.pusy(val);
		}
		
		System.out.print("스택에 있는 모든 문자열 팝 : ");
		String word = "";
		while((word = stackApp.pop())!=null) {
			System.out.print(word + " ");
		}
	}
}
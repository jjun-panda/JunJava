package java04_stu.homework;

import java.util.Scanner;

public class TodoList {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		listTodo();
	}

	public static void listTodo() {
		formTodo();
		while (true) {
			System.out.println("\n[1]추가하기  [2]수정하기  [3]종료하기");
			System.out.print("해당 번호를 입력해주세요>> ");
			int check = sc.nextInt();
			System.out.println(">>" + check + "번 입력하셨습니다.");

			switch (check) {
				case 1:
					System.out.println("-".repeat(10) + " 추가하기 " + "-".repeat(10));
					addTodo();
					break;
				case 2:
					System.out.println("-".repeat(10) + " 수정하기 " + "-".repeat(10));
					editTodo();
					break;
				case 3:
					System.out.println("-".repeat(10) + " 종료하기 " + "-".repeat(10));
					exitTodo();
					break;
				default:
					System.out.println(">>오 이런! 해당 번호가 존재하지 않습니다.");
					break;
			}
		}		
	}

	public static void formTodo() {
			System.out.println("-".repeat(30));
			System.out.println(" ".repeat(4) + " 김코딩의 할일 리스트 " + " ".repeat(4));
			System.out.println("-".repeat(30));
			// ...
	}

	public static void addTodo() {
			// ...
	}

	public static void editTodo() {
			// ...
	}

	public static void exitTodo() {
			System.out.print("Have a Happy Today!");
			System.exit(0);
	}
}
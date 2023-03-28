import java.util.Scanner;

public class test08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("exit을 입력하면 종료합니다.");
        while(true) {
            System.out.print(">>");
            String test = scanner.nextLine();
            if(test.equals("exit", "EXIT")) {
                break;
            }
        }
		
		System.out.println("종료합니다...");
		scanner.close();
	}
}

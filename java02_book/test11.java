import java.util.Scanner;
public class test11 {

	// // 1안
	// public static void main(String[] args) {
    //     System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
    //     Scanner userGame = new Scanner(System.in);
        
    //     System.out.print("철수 >> ");
    //     String user1 = userGame.next();
        
    //     System.out.print("영희 >> ");
    //     String user2 = userGame.next();
        
    //     if(user1.equals("가위")) {
    //         if(user2.contentEquals("가위")) {
    //             System.out.println("비겼습니다.");
    //         }else if(user2.contentEquals("바위")) {
    //             System.out.println("영희가 이겼습니다.");
    //         }else if(user2.contentEquals("보")) {
    //             System.out.println("철수가 이겼습니다.");
    //         }else {
    //             System.out.println("가위 바위 보 중에 입력하세요.");
    //         }
    //     }
    //     else if(user1.equals("바위")) {
    //         if(user2.contentEquals("가위")) {
    //             System.out.println("철수가 이겼습니다");
    //         }else if(user2.contentEquals("바위")) {
    //             System.out.println("비겼습니다");
    //         }else if(user2.contentEquals("보")) {
    //             System.out.println("영희가 이겼습니다.");
    //         }else {
    //             System.out.println("가위 바위 보 중에 입력하세요.");
    //         }
    //     }
    //     else if(user1.equals("보")) {
    //         if(user2.contentEquals("가위")) {
    //             System.out.println("영희가 이겼습니다.");
    //         }else if(user2.contentEquals("바위")) {
    //             System.out.println("철수가 이겼습니다.");
    //         }else if(user2.contentEquals("보")) {
    //             System.out.println("비겼습니다.");
    //         }else {
    //             System.out.println("가위 바위 보 중에 입력하세요.");
    //         }
    //     }
    //     else {
    //         System.out.println("가위 바위 보 중에 입력하세요.");
    //     }
    // }

	// 2안
	public static void main(String[] args) {
        System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
        Scanner userGame = new Scanner(System.in);
        
        System.out.print("철수 >> ");
        String user1 = userGame.next();
        
        System.out.print("영희 >> ");
        String user2 = userGame.next();
        
		switch(user1) {
			switch (user1 = "가위") {
				case "가위": System.out.println("비겼습니다.");
				break;
				case "바위": System.out.println("영희가 이겼습니다.");
				break;
				case "보": System.out.println("철수가 이겼습니다.");
				break;
				default: System.out.println("가위 바위 보 중에 입력하세요.");
			}
			switch (user1 = "바위") {
				case "가위": System.out.println("철수가 이겼습니다.");
				break;
				case "바위": System.out.println("비겼습니다");
				break;
				case "보": System.out.println("영희가 이겼습니다.");
				break;
				default: System.out.println("가위 바위 보 중에 입력하세요.");
			}
			switch (user1 = "보") {
				case "가위": System.out.println("영희가 이겼습니다.");
				break;
				case "바위": System.out.println("철수가 이겼습니다.");
				break;
				case "보": System.out.println("비겼습니다");
				break;
				default: System.out.println("가위 바위 보 중에 입력하세요.");
			}
		}
		
		userGame.close();
	}
}
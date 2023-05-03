package java04_stu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TodoList {
    private static List<Map<String, Object>> tasks = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            printMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    addTask();
                    break;
                case "2":
                    completeTask();
                    break;
                case "3":
                    showTasks();
                    break;
                case "4":
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("할 일 관리 프로그램");
        System.out.println("--------------------");
        System.out.println("1. 할 일 추가");
        System.out.println("2. 할 일 완료");
        System.out.println("3. 할 일 목록");
        System.out.println("4. 종료");
        System.out.println("--------------------");
        System.out.print("선택> ");
    }

    private static void addTask() {
        System.out.print("할 일 제목을 입력하세요: ");
        String title = scanner.nextLine();
        Map<String, Object> task = new HashMap<>();
        task.put("title", title);
        task.put("done", false);
        tasks.add(task);
        System.out.println("할 일이 추가되었습니다.");
    }

    private static void completeTask() {
        System.out.print("완료한 할 일의 번호를 입력하세요: ");
        int index = Integer.parseInt(scanner.nextLine()) - 1;
        if (index < 0 || index >= tasks.size()) {
            System.out.println("잘못된 번호입니다.");
        } else {
            Map<String, Object> task = tasks.get(index);
            task.put("done", true);
            System.out.println("할 일이 완료되었습니다.");
        }
    }

    private static void showTasks() {
        System.out.println("할 일 목록");
        System.out.println("--------------------");
        for (int i = 0; i < tasks.size(); i++) {
            Map<String, Object> task = tasks.get(i);
            String status = (boolean) task.get("done") ? "완료" : "미완료";
            System.out.printf("%d. [%s] %s\n", i + 1, status, task.get("title"));
        }
        System.out.println("--------------------");
        System.out.println("총 " + tasks.size() + "개의 할 일이 있습니다.");
    }
}

package java05_stu;

import java.util.Scanner;

class ShapeList {
    Shape start, last, obj, p;

    public void add(Shape node) {
        if(start == null) {
            start = node;
            last = start;
            System.out.println("최초 노드 저장");
            return;
        }
        last.next = node;
        last = last.next;
        System.out.println("새 노드 추가");
    }

    public void show() {
        if(start == null) {
            System.out.println("노드가 비었습니다.");
            return;
        }
        p = start;
        while(p != null) {
            p.draw();
            p = p.next;
        }
    }

    public void delete(int idx) {
        p = start;
        int cnt = 0;
        while(p != null) {
            p.draw();
            p = p.next;
            cnt++;
        }
    }
}
public class ShapeListEx {
    public static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        ShapeList sList = new ShapeList();
        // sList.add(new Line());
        // sList.add(new Rect());
        // sList.add(new Circle());
        // sList.add(new Shape());
        // sList.add(new Rect());

        // sList.show();

        while(true) {
            System.out.print("1.Line 2.Rect 3.Circle 4.Shape 5.보기 6.삭제 7.종료 >> ");
            switch(scan.nextInt()) {
                case 1 : sList.add(new Line()); break;
                case 2 : sList.add(new Rect()); break;
                case 3 : sList.add(new Circle()); break;
                case 4 : sList.add(new Shape()); break;
                case 5 : sList.show(); break;
                case 6 : 
                    System.out.print("삭제할 번호 >> ");
                    int no = scan.nextInt();
                    sList.delete(no);
                    break;
                case 7 : System.exit(0); break;
                default : System.out.println("해당 사항 없습니다!");
            }
        }
    }
}
